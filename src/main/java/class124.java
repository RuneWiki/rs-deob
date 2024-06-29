import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class124 extends class266 {
   @OriginalMember(
      owner = "client!ik",
      name = "D",
      descriptor = "I"
   )
   public int field1620;
   @OriginalMember(
      owner = "client!ik",
      name = "N",
      descriptor = "I"
   )
   public int field1624;
   @OriginalMember(
      owner = "client!ik",
      name = "K",
      descriptor = "Z"
   )
   public boolean field1622;
   @OriginalMember(
      owner = "client!ik",
      name = "O",
      descriptor = "F"
   )
   public float field1621;
   @OriginalMember(
      owner = "client!ik",
      name = "I",
      descriptor = "F"
   )
   public float field1623;
   @OriginalMember(
      owner = "client!ik",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1625 = new String[]{method1081(method1080(".;\u001c\u0004u)9F\u00064")), method1081(method1080(")%^T")), method1081(method1080("<~\u001c\u0016a")), method1081(method1080(".;\u001cr4"))};
   @OriginalMember(
      owner = "client!ik",
      name = "P",
      descriptor = "I"
   )
   public static int field1619;

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(BLgea;)V"
   )
   public static final void method1079(byte arg0, class66 arg1) {
      boolean var2 = client.field1481;

      try {
         if (arg0 == -47) {
            ++field1619;
            int var3 = 0;
            if (var2 || ~class54.field744 < ~var3) {
               do {
                  int var4 = arg1.method653((byte)-71);
                  int var5 = arg1.method603(-2);
                  if (var5 == 65535) {
                     var5 = -1;
                  }

                  if (class490.field6838[var4] != null) {
                     class490.field6838[var4].field8331 = var5;
                  }

                  ++var3;
               } while(~class54.field744 < ~var3);

            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1625[3] + arg0 + ',' + (arg1 != null ? field1625[2] : field1625[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIIIZ[BI)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         this.field1620 = arg4;
         this.field1624 = arg3;
         if (super.field8090 != 34037) {
            this.field1622 = true;
            this.field1623 = this.field1621 = 1.0F;
         } else {
            this.field1621 = (float)arg4;
            this.field1622 = false;
            this.field1623 = (float)arg3;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1625[2] : field1625[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIIII[BI)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field1624 = arg2;
         this.field1620 = arg3;
         this.method2124(0, 3314, true, 0, 0, arg7, arg3, arg2, arg6, 0);
         this.field1623 = (float)arg2 / (float)arg4;
         this.field1622 = false;
         this.field1621 = (float)arg3 / (float)arg5;
         this.method2121(0, false, false);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1625[2] : field1625[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIIZ[III)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            this.field1624 = arg2;
            if (super.field8090 == 34037) {
               this.field1622 = false;
               this.field1623 = (float)arg2;
               this.field1621 = (float)arg3;
               if (!client.field1481) {
                  break label28;
               }
            }

            this.field1622 = true;
            this.field1623 = this.field1621 = 1.0F;
         }

         this.field1620 = arg3;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1625[2] : field1625[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIIIIZ)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);

      try {
         label23: {
            this.field1624 = arg4;
            if (super.field8090 == 34037) {
               this.field1622 = false;
               this.field1623 = (float)arg4;
               this.field1621 = (float)arg5;
               if (!client.field1481) {
                  break label23;
               }
            }

            this.field1623 = this.field1621 = 1.0F;
            this.field1622 = true;
         }

         this.field1620 = arg5;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIIII)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field1620 = arg3;
         this.field1622 = false;
         this.field1621 = (float)arg3 / (float)arg5;
         this.field1624 = arg2;
         this.field1623 = (float)arg2 / (float)arg4;
         this.method2121(0, false, false);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIIIIIZ)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);

      try {
         this.field1624 = arg3;
         this.field1621 = (float)arg4 / (float)arg6;
         this.field1620 = arg4;
         this.field1622 = false;
         this.field1623 = (float)arg3 / (float)arg5;
         this.method2121(0, false, false);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIII[I)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, 6408, arg3, arg4);

      try {
         this.field1620 = arg2;
         this.field1624 = arg1;
         this.method2126(0, arg2, 0, true, 0, arg5, 110, arg1, 0);
         this.field1621 = (float)arg2 / (float)arg4;
         this.field1622 = false;
         this.field1623 = (float)arg1 / (float)arg3;
         this.method2121(0, false, false);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1625[2] : field1625[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Liu;IIII)V"
   )
   public class124(class530 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field1620 = arg4;
         this.field1624 = arg3;
         if (~super.field8090 == -34038) {
            this.field1622 = false;
            this.field1623 = (float)arg3;
            this.field1621 = (float)arg4;
         } else {
            this.field1622 = true;
            this.field1623 = this.field1621 = 1.0F;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1625[0] + (arg0 != null ? field1625[2] : field1625[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1080(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1081(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
