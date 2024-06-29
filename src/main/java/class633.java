import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class633 extends class281 {
   @OriginalMember(
      owner = "client!pe",
      name = "M",
      descriptor = "F"
   )
   public float field9233;
   @OriginalMember(
      owner = "client!pe",
      name = "J",
      descriptor = "I"
   )
   public int field9235;
   @OriginalMember(
      owner = "client!pe",
      name = "H",
      descriptor = "F"
   )
   public float field9234;
   @OriginalMember(
      owner = "client!pe",
      name = "O",
      descriptor = "I"
   )
   public int field9232;
   @OriginalMember(
      owner = "client!pe",
      name = "I",
      descriptor = "Z"
   )
   public boolean field9230;
   @OriginalMember(
      owner = "client!pe",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9237 = new String[]{method4650(method4649(";\u001bj2")), method4650(method4649(".@(p\u000f")), method4650(method4649("%\u000b(b\u001b;\u0007r`Z")), method4650(method4649("%\u000b(\u001fZ"))};
   @OriginalMember(
      owner = "client!pe",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field9229 = new int[2];
   @OriginalMember(
      owner = "client!pe",
      name = "N",
      descriptor = "Lgh;"
   )
   public static class572 field9231 = new class572(96, 6);
   @OriginalMember(
      owner = "client!pe",
      name = "L",
      descriptor = "I"
   )
   public static int field9236;

   @OriginalMember(
      owner = "client!pe",
      name = "g",
      descriptor = "(I)V",
      line = 5
   )
   public static void method4648(int arg0) {
      try {
         field9231 = null;
         if (arg0 < -117) {
            field9229 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9237[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIIIIIZ)V",
      line = 16
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);

      try {
         this.field9233 = (float)arg3 / (float)arg5;
         this.field9235 = arg4;
         this.field9234 = (float)arg4 / (float)arg6;
         this.field9232 = arg3;
         this.field9230 = false;
         this.method2195(false, (byte)-59, false);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIII[I)V",
      line = 29
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, 6408, arg3, arg4);

      try {
         this.field9232 = arg1;
         this.field9235 = arg2;
         this.method2193(0, 0, 0, arg2, true, arg5, arg1, 0, 0);
         this.field9233 = (float)arg1 / (float)arg3;
         this.field9234 = (float)arg2 / (float)arg4;
         this.field9230 = false;
         this.method2195(false, (byte)-59, false);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9237[1] : field9237[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIIII[BI)V",
      line = 44
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field9232 = arg2;
         this.field9235 = arg3;
         this.method2198(0, arg2, 0, arg6, arg7, -107, true, 0, arg3, 0);
         this.field9233 = (float)arg2 / (float)arg4;
         this.field9234 = (float)arg3 / (float)arg5;
         this.field9230 = false;
         this.method2195(false, (byte)-59, false);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9237[1] : field9237[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIIII)V",
      line = 59
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field9234 = (float)arg3 / (float)arg5;
         this.field9232 = arg2;
         this.field9235 = arg3;
         this.field9233 = (float)arg2 / (float)arg4;
         this.field9230 = false;
         this.method2195(false, (byte)-59, false);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIII)V",
      line = 74
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         label23: {
            if (super.field10277 != 34037) {
               this.field9233 = this.field9234 = 1.0F;
               this.field9230 = true;
               if (!client.field4564) {
                  break label23;
               }
            }

            this.field9234 = (float)arg4;
            this.field9233 = (float)arg3;
            this.field9230 = false;
         }

         this.field9235 = arg4;
         this.field9232 = arg3;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIIZ[III)V",
      line = 95
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            if (super.field10277 == 34037) {
               this.field9233 = (float)arg2;
               this.field9234 = (float)arg3;
               this.field9230 = false;
               if (!client.field4564) {
                  break label28;
               }
            }

            this.field9230 = true;
            this.field9233 = this.field9234 = 1.0F;
         }

         this.field9232 = arg2;
         this.field9235 = arg3;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9237[1] : field9237[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIIIIZ)V",
      line = 119
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);

      try {
         label23: {
            if (super.field10277 == 34037) {
               this.field9230 = false;
               this.field9233 = (float)arg4;
               this.field9234 = (float)arg5;
               if (!client.field4564) {
                  break label23;
               }
            }

            this.field9233 = this.field9234 = 1.0F;
            this.field9230 = true;
         }

         this.field9232 = arg4;
         this.field9235 = arg5;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lrk;IIIIZ[BI)V",
      line = 142
   )
   public class633(class35 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            if (super.field10277 != 34037) {
               this.field9233 = this.field9234 = 1.0F;
               this.field9230 = true;
               if (!client.field4564) {
                  break label28;
               }
            }

            this.field9233 = (float)arg3;
            this.field9234 = (float)arg4;
            this.field9230 = false;
         }

         this.field9232 = arg3;
         this.field9235 = arg4;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field9237[2] + (arg0 != null ? field9237[1] : field9237[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9237[1] : field9237[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4649(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4650(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
