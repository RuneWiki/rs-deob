import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class219 {
   @OriginalMember(
      owner = "client!fu",
      name = "d",
      descriptor = "I"
   )
   private int field3131 = 0;
   @OriginalMember(
      owner = "client!fu",
      name = "f",
      descriptor = "I"
   )
   private int field3137 = 0;
   @OriginalMember(
      owner = "client!fu",
      name = "g",
      descriptor = "I"
   )
   private int field3134 = 0;
   @OriginalMember(
      owner = "client!fu",
      name = "h",
      descriptor = "Laea;"
   )
   private class678 field3135;
   @OriginalMember(
      owner = "client!fu",
      name = "i",
      descriptor = "Lqk;"
   )
   private class118 field3128;
   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "[Lkja;"
   )
   private class515[] field3133;
   @OriginalMember(
      owner = "client!fu",
      name = "c",
      descriptor = "Lnn;"
   )
   public class654 field3136;
   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3140 = new String[]{method1902(method1901("*+F\u0015U")), method1902(method1901("\"+\u0004<")), method1902(method1901("7pF~\u0000")), method1902(method1901("*+F\u0012U")), method1902(method1901("*+F\u0011U")), method1902(method1901("*+F\u0014U")), method1902(method1901("*+Fl\u0014\"7\u001cnU")), method1902(method1901("*+F\u0013U"))};
   @OriginalMember(
      owner = "client!fu",
      name = "l",
      descriptor = "I"
   )
   public static int field3129;
   @OriginalMember(
      owner = "client!fu",
      name = "k",
      descriptor = "I"
   )
   public static int field3130;
   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "I"
   )
   public static int field3132;
   @OriginalMember(
      owner = "client!fu",
      name = "e",
      descriptor = "I"
   )
   public static int field3138;
   @OriginalMember(
      owner = "client!fu",
      name = "j",
      descriptor = "I"
   )
   public static int field3139;

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(FIIFFIBILgb;FI[BIF)V"
   )
   public static final void method1896(float param0, int param1, int param2, float param3, float param4, int param5, byte param6, int param7, class570 param8, float param9, int param10, byte[] param11, int param12, float param13) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(IZIZII)V"
   )
   public final void method1897(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
      try {
         boolean var9 = arg3 & this.field3135.method180();
         ++field3130;
         if (!var9 && (~arg5 == -5 || arg5 == 8 || arg5 == 9)) {
            if (~arg5 == -5) {
               arg2 = arg4;
            }

            arg5 = 2;
         }

         if (~arg5 != -1 && arg1) {
            arg5 |= Integer.MIN_VALUE;
         }

         label58: {
            if (~this.field3137 != ~arg5) {
               if (~this.field3137 != -1) {
                  this.field3133[this.field3137 & Integer.MAX_VALUE].method133(false);
               }

               if (arg5 != 0) {
                  this.field3133[Integer.MAX_VALUE & arg5].method136(arg1, 3);
                  this.field3133[Integer.MAX_VALUE & arg5].method132(-15, arg1);
                  this.field3133[Integer.MAX_VALUE & arg5].method137(arg2, (byte)62, arg4);
               }

               this.field3137 = arg5;
               this.field3134 = arg2;
               this.field3131 = arg4;
               if (!client.field10022) {
                  break label58;
               }
            }

            if (~this.field3137 != -1) {
               this.field3133[this.field3137 & Integer.MAX_VALUE].method132(arg0 ^ -25087, arg1);
               if (this.field3131 != arg4 || this.field3134 != arg2) {
                  this.field3133[this.field3137 & Integer.MAX_VALUE].method137(arg2, (byte)59, arg4);
                  this.field3134 = arg2;
                  this.field3131 = arg4;
               }
            }
         }

         if (arg0 != 25072) {
            this.field3133 = null;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3140[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Lln;IZ)Z"
   )
   public final boolean method1898(class719 arg0, int arg1, boolean arg2) {
      try {
         ++field3132;
         if (this.field3137 == 0) {
            return false;
         } else {
            if (!arg2) {
               this.field3133 = null;
            }

            this.field3133[Integer.MAX_VALUE & this.field3137].method131(-123, arg0, arg1);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3140[3] + (arg0 != null ? field3140[2] : field3140[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method1899(int arg0, int arg1) {
      try {
         if (arg1 > -1) {
            this.method1899(9, 13);
         }

         ++field3138;
         return this.field3133[arg0].method135(19455);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3140[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(IIILcn;ZI)V"
   )
   public static final void method1900(int arg0, int arg1, int arg2, class468 arg3, boolean arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field3129;
         if (arg5 >= 1 && arg2 >= 1 && class234.field3626 + -2 >= arg5 && ~(class209.field2989 - 2) <= ~arg2) {
            if (class324.field4826 == null) {
               return;
            }

            class338 var7 = class203.field2904.method4058(arg0, arg5, (byte)100, arg2, arg1);
            if (var7 != null) {
               label71: {
                  if (var7 instanceof class69) {
                     ((class69)var7).method717(arg3, 6314);
                     if (!var6) {
                        break label71;
                     }
                  }

                  if (var7 instanceof class155) {
                     ((class155)var7).method1485(-1, arg3);
                     if (!var6) {
                        break label71;
                     }
                  }

                  if (!(var7 instanceof class501)) {
                     if (!(var7 instanceof class737)) {
                        break label71;
                     }

                     ((class737)var7).method5333(22585, arg3);
                     if (!var6) {
                        break label71;
                     }
                  }

                  ((class501)var7).method3789((byte)13, arg3);
               }
            }
         }

         if (arg4) {
            ;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3140[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3140[2] : field3140[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class219(class678 arg0) {
      try {
         this.field3135 = arg0;
         this.field3128 = new class118(arg0);
         this.field3133 = new class515[10];
         this.field3133[1] = new class625(arg0);
         this.field3133[2] = new class133(arg0, this.field3128);
         this.field3133[4] = new class60(arg0, this.field3128);
         this.field3133[5] = new class558(arg0, this.field3128);
         this.field3133[6] = new class206(arg0);
         this.field3133[7] = new class16(arg0);
         this.field3133[3] = this.field3136 = new class654(arg0);
         this.field3133[8] = new class617(arg0, this.field3128);
         this.field3133[9] = new class755(arg0, this.field3128);
         if (!this.field3133[8].method135(19455)) {
            this.field3133[8] = this.field3133[4];
         }

         if (!this.field3133[9].method135(19455)) {
            this.field3133[9] = this.field3133[8];
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3140[6] + (arg0 != null ? field3140[2] : field3140[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1901(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1902(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
