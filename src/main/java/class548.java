import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class548 extends class70 {
   @OriginalMember(
      owner = "client!hp",
      name = "Q",
      descriptor = "I"
   )
   private int field8206 = 0;
   @OriginalMember(
      owner = "client!hp",
      name = "G",
      descriptor = "I"
   )
   private int field8212 = 1;
   @OriginalMember(
      owner = "client!hp",
      name = "J",
      descriptor = "I"
   )
   private int field8213 = 0;
   @OriginalMember(
      owner = "client!hp",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8215 = new String[]{method4168(method4167("cnE\u00121")), method4168(method4167("cnE\u00101")), method4168(method4167("ot")), method4168(method4167("cnE\u00171")), method4168(method4167("ek\u0007?")), method4168(method4167("p0E}d")), method4168(method4167("cnE\u001b1")), method4168(method4167("cnE\u00111"))};
   @OriginalMember(
      owner = "client!hp",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field8208 = new int[]{2047, 16383, 65535};
   @OriginalMember(
      owner = "client!hp",
      name = "P",
      descriptor = "Luk;"
   )
   public static class498 field8205 = new class498(30, 6);
   @OriginalMember(
      owner = "client!hp",
      name = "K",
      descriptor = "I"
   )
   public static int field8204;
   @OriginalMember(
      owner = "client!hp",
      name = "N",
      descriptor = "I"
   )
   public static int field8207;
   @OriginalMember(
      owner = "client!hp",
      name = "F",
      descriptor = "I"
   )
   public static int field8209;
   @OriginalMember(
      owner = "client!hp",
      name = "I",
      descriptor = "I"
   )
   public static int field8210;
   @OriginalMember(
      owner = "client!hp",
      name = "O",
      descriptor = "I"
   )
   public static int field8211;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hp",
      name = "M",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8214;

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg0 != -1) {
            this.field8213 = -118;
         }

         label45: {
            label44: {
               label43: {
                  if (~arg1 != -1) {
                     if (arg1 == 1) {
                        break label43;
                     }

                     if (~arg1 != -4) {
                        break label45;
                     }

                     if (!var4) {
                        break label44;
                     }
                  }

                  this.field8206 = arg2.method2855(-31007);
                  if (!var4) {
                     break label45;
                  }
               }

               this.field8213 = arg2.method2855(-31007);
               if (!var4) {
                  break label45;
               }
            }

            this.field8212 = arg2.method2855(-31007);
         }

         ++field8209;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8215[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8215[5] : field8215[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4164(int arg0) {
      try {
         field8205 = null;
         if (arg0 > -94) {
            field8205 = null;
         }

         field8208 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8215[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8207;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            field8208 = null;
         }

         if (super.field923.field7284) {
            int var5 = class204.field3113[arg1];
            int var6 = var5 + -2048 >> 1;
            int var7 = 0;
            if (var3 || var7 < class678.field10127) {
               do {
                  int var10;
                  label38: {
                     int var8 = class199.field3060[var7];
                     int var9 = var8 + -2048 >> 1;
                     if (~this.field8206 == -1) {
                        var10 = (var8 - var5) * this.field8212;
                        if (!var3) {
                           break label38;
                        }
                     }

                     int var11 = var9 * var9 - -(var6 * var6) >> 12;
                     int var12 = (int)(4096.0D * Math.sqrt((double)((float)var11 / 4096.0F)));
                     var10 = (int)((double)(this.field8212 * var12) * 3.141592653589793D);
                  }

                  int var13;
                  label45: {
                     var13 = var10 - (var10 & -4096);
                     if (this.field8213 != 0) {
                        if (~this.field8213 != -3) {
                           break label45;
                        }

                        var13 -= 2048;
                        if (~var13 > -1) {
                           var13 = -var13;
                        }

                        var13 = 2048 - var13 << 1;
                        if (!var3) {
                           break label45;
                        }
                     }

                     var13 = class143.field2034[(4094 & var13) >> 4] + 4096 >> 1;
                  }

                  var4[var7] = var13;
                  ++var7;
               } while(var7 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field8215[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "<init>",
      descriptor = "()V"
   )
   public class548() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(ILha;B)Z"
   )
   public static final boolean method4165(int param0, class610 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method275(boolean arg0) {
      try {
         if (arg0) {
            method4164(-117);
         }

         ++field8211;
         class452.method3548((byte)-119);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8215[7] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4166(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4167(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4168(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
