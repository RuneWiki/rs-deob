import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class507 {
   @OriginalMember(
      owner = "client!lia",
      name = "n",
      descriptor = "F"
   )
   public float field7023;
   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "F"
   )
   public float field7029;
   @OriginalMember(
      owner = "client!lia",
      name = "u",
      descriptor = "F"
   )
   public float field7033;
   @OriginalMember(
      owner = "client!lia",
      name = "c",
      descriptor = "I"
   )
   public int field7021;
   @OriginalMember(
      owner = "client!lia",
      name = "d",
      descriptor = "F"
   )
   public float field7035;
   @OriginalMember(
      owner = "client!lia",
      name = "r",
      descriptor = "Ltba;"
   )
   public class172 field7031;
   @OriginalMember(
      owner = "client!lia",
      name = "q",
      descriptor = "I"
   )
   public int field7018;
   @OriginalMember(
      owner = "client!lia",
      name = "t",
      descriptor = "F"
   )
   public float field7020;
   @OriginalMember(
      owner = "client!lia",
      name = "l",
      descriptor = "I"
   )
   public int field7024;
   @OriginalMember(
      owner = "client!lia",
      name = "k",
      descriptor = "F"
   )
   public float field7026;
   @OriginalMember(
      owner = "client!lia",
      name = "p",
      descriptor = "I"
   )
   public int field7022;
   @OriginalMember(
      owner = "client!lia",
      name = "v",
      descriptor = "I"
   )
   public int field7019;
   @OriginalMember(
      owner = "client!lia",
      name = "s",
      descriptor = "I"
   )
   public int field7027;
   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7037 = new String[]{method3690(method3689("\nQ\u0004d")), method3690(method3689("\u001f\nF&\u0003")), method3690(method3689("\bM\t&<L")), method3690(method3689("\bM\t&B\rJ\u0001|@L")), method3690(method3689("\bM\t&?L")), method3690(method3689("\bM\t&:L")), method3690(method3689("\bM\t&=L"))};
   @OriginalMember(
      owner = "client!lia",
      name = "g",
      descriptor = "Ldia;"
   )
   public static class245 field7016 = new class245(8);
   @OriginalMember(
      owner = "client!lia",
      name = "e",
      descriptor = "I"
   )
   public static int field7030 = 104;
   @OriginalMember(
      owner = "client!lia",
      name = "o",
      descriptor = "Lo;"
   )
   public static class31 field7032 = new class31(3, 4);
   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "I"
   )
   public static int field7036 = 0;
   @OriginalMember(
      owner = "client!lia",
      name = "j",
      descriptor = "Lbga;"
   )
   public static class378 field7034 = new class378(78, -1);
   @OriginalMember(
      owner = "client!lia",
      name = "i",
      descriptor = "I"
   )
   public static int field7015;
   @OriginalMember(
      owner = "client!lia",
      name = "m",
      descriptor = "I"
   )
   public static int field7017;
   @OriginalMember(
      owner = "client!lia",
      name = "h",
      descriptor = "I"
   )
   public static int field7025;
   @OriginalMember(
      owner = "client!lia",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field7028;

   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "(B)Z"
   )
   public static final boolean method3685(byte arg0) {
      try {
         if (arg0 != 28) {
            return false;
         } else {
            ++field7017;
            ++class55.field599;
            class95.field1265 = true;
            return true;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7037[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3686(byte arg0) {
      try {
         field7032 = null;
         if (arg0 != -72) {
            method3686((byte)60);
         }

         field7034 = null;
         field7028 = null;
         field7016 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7037[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(BLwm;)V"
   )
   public final void method3687(byte arg0, class594 arg1) {
      try {
         this.field7023 = (float)(8 * arg1.method4288((byte)60)) / 255.0F;
         ++field7015;
         this.field7033 = (float)(arg1.method4288((byte)101) * 8) / 255.0F;
         this.field7029 = (float)(arg1.method4288((byte)118) * 8) / 255.0F;
         if (arg0 != 89) {
            this.method3688((byte)97, (class507)null);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7037[6] + arg0 + ',' + (arg1 != null ? field7037[1] : field7037[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(BLlia;)Z"
   )
   public final boolean method3688(byte arg0, class507 arg1) {
      try {
         int var3 = -64 / ((-10 - arg0) / 50);
         ++field7025;
         return this.field7021 == arg1.field7021 && this.field7026 == arg1.field7026 && this.field7020 == arg1.field7020 && this.field7035 == arg1.field7035 && this.field7033 == arg1.field7033 && this.field7023 == arg1.field7023 && this.field7029 == arg1.field7029 && ~this.field7019 == ~arg1.field7019 && ~this.field7022 == ~arg1.field7022 && this.field7031 == arg1.field7031;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7037[2] + arg0 + ',' + (arg1 != null ? field7037[1] : field7037[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "<init>",
      descriptor = "()V"
   )
   public class507() {
      this.field7023 = 1.0F;
      this.field7029 = 1.0F;
      this.field7033 = 0.25F;

      try {
         this.field7021 = class510.field7061;
         this.field7035 = 1.2F;
         this.field7031 = class233.field2892;
         this.field7018 = -50;
         this.field7020 = 0.69921875F;
         this.field7024 = -50;
         this.field7026 = 1.1523438F;
         this.field7022 = 0;
         this.field7019 = class73.field899;
         this.field7027 = -60;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7037[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "<init>",
      descriptor = "(Lwm;)V"
   )
   public class507(class594 arg0) {
      boolean var2 = client.field4273;
      super();
      this.field7023 = 1.0F;
      this.field7029 = 1.0F;
      this.field7033 = 0.25F;

      try {
         int var3;
         label114: {
            var3 = arg0.method4288((byte)65);
            if (class674.field9907.field8457.method1798((byte)-84) == 1 && class252.field3198.method500() > 0) {
               label105: {
                  if ((1 & var3) != 0) {
                     this.field7021 = arg0.method4302(true);
                     if (!var2) {
                        break label105;
                     }
                  }

                  this.field7021 = class510.field7061;
               }

               label100: {
                  if (~(var3 & 2) != -1) {
                     this.field7026 = (float)arg0.method4280(-19104) / 256.0F;
                     if (!var2) {
                        break label100;
                     }
                  }

                  this.field7026 = 1.1523438F;
               }

               label95: {
                  if (~(var3 & 4) != -1) {
                     this.field7020 = (float)arg0.method4280(-19104) / 256.0F;
                     if (!var2) {
                        break label95;
                     }
                  }

                  this.field7020 = 0.69921875F;
               }

               if ((var3 & 8) != 0) {
                  this.field7035 = (float)arg0.method4280(-19104) / 256.0F;
                  if (!var2) {
                     break label114;
                  }
               }

               this.field7035 = 1.2F;
               if (!var2) {
                  break label114;
               }
            }

            if (~(1 & var3) != -1) {
               arg0.method4302(true);
            }

            if (~(var3 & 2) != -1) {
               arg0.method4280(-19104);
            }

            if (~(4 & var3) != -1) {
               arg0.method4280(-19104);
            }

            if (~(8 & var3) != -1) {
               arg0.method4280(-19104);
            }

            this.field7021 = class510.field7061;
            this.field7026 = 1.1523438F;
            this.field7020 = 0.69921875F;
            this.field7035 = 1.2F;
         }

         label85: {
            if ((var3 & 16) == 0) {
               this.field7027 = -60;
               this.field7018 = -50;
               this.field7024 = -50;
               if (!var2) {
                  break label85;
               }
            }

            this.field7018 = arg0.method4333(-95);
            this.field7027 = arg0.method4333(-80);
            this.field7024 = arg0.method4333(-93);
         }

         label80: {
            if (~(32 & var3) == -1) {
               this.field7019 = class73.field899;
               if (!var2) {
                  break label80;
               }
            }

            this.field7019 = arg0.method4302(true);
         }

         label75: {
            if ((var3 & 64) == 0) {
               this.field7022 = 0;
               if (!var2) {
                  break label75;
               }
            }

            this.field7022 = arg0.method4280(-19104);
         }

         if ((128 & var3) == 0) {
            this.field7031 = class233.field2892;
         } else {
            int var4 = arg0.method4280(-19104);
            int var5 = arg0.method4280(-19104);
            int var6 = arg0.method4280(-19104);
            int var7 = arg0.method4280(-19104);
            int var8 = arg0.method4280(-19104);
            int var9 = arg0.method4280(-19104);
            this.field7031 = class707.method5142(var6, var4, true, var8, var5, var7, var9);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field7037[3] + (arg0 != null ? field7037[1] : field7037[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3689(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3690(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
