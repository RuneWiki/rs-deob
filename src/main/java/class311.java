import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nka")
public class class311 {
   @OriginalMember(
      owner = "client!nka",
      name = "b",
      descriptor = "B"
   )
   public byte field4262;
   @OriginalMember(
      owner = "client!nka",
      name = "f",
      descriptor = "B"
   )
   public byte field4268;
   @OriginalMember(
      owner = "client!nka",
      name = "k",
      descriptor = "[I"
   )
   public int[] field4271;
   @OriginalMember(
      owner = "client!nka",
      name = "n",
      descriptor = "[I"
   )
   public int[] field4274;
   @OriginalMember(
      owner = "client!nka",
      name = "m",
      descriptor = "[I"
   )
   public int[] field4265;
   @OriginalMember(
      owner = "client!nka",
      name = "e",
      descriptor = "S"
   )
   public short field4276;
   @OriginalMember(
      owner = "client!nka",
      name = "g",
      descriptor = "S"
   )
   public short field4270;
   @OriginalMember(
      owner = "client!nka",
      name = "d",
      descriptor = "S"
   )
   public short field4266;
   @OriginalMember(
      owner = "client!nka",
      name = "j",
      descriptor = "[S"
   )
   public short[] field4267;
   @OriginalMember(
      owner = "client!nka",
      name = "i",
      descriptor = "[S"
   )
   public short[] field4263;
   @OriginalMember(
      owner = "client!nka",
      name = "c",
      descriptor = "S"
   )
   public short field4269;
   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "[S"
   )
   public short[] field4264;
   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4277 = new String[]{method2303(method2302("h\u001b$O6.")), method2303(method2302("h\u001b$O4.")), method2303(method2302("h\u001b$OKo\u001e,\u0015I.")), method2303(method2302("h\u0005)\r")), method2303(method2302("}^kO\n")), method2303(method2302("h\u001b$O5."))};
   @OriginalMember(
      owner = "client!nka",
      name = "h",
      descriptor = "Lada;"
   )
   public static class175 field4273 = new class175();
   @OriginalMember(
      owner = "client!nka",
      name = "l",
      descriptor = "I"
   )
   public static int field4272;
   @OriginalMember(
      owner = "client!nka",
      name = "o",
      descriptor = "I"
   )
   public static int field4275;

   @OriginalMember(
      owner = "client!nka",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method2299(int arg0) {
      try {
         class341.method2503(-23);
         ++field4275;
         int var1 = -36 / ((-61 - arg0) / 52);
         class681.field10034 = false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4277[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(ILria;)I",
      line = 26
   )
   public static final int method2300(int arg0, class301 arg1) {
      try {
         if (arg0 != 16756) {
            field4273 = null;
         }

         ++field4272;
         if (class301.field4111 != arg1) {
            if (class301.field4113 != arg1) {
               if (class301.field4116 == arg1) {
                  return 5124;
               } else if (class301.field4117 != arg1) {
                  if (class301.field4118 != arg1) {
                     if (class301.field4119 != arg1) {
                        if (class301.field4120 == arg1) {
                           return 5131;
                        } else if (class301.field4121 == arg1) {
                           return 5126;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 5125;
                     }
                  } else {
                     return 5123;
                  }
               } else {
                  return 5121;
               }
            } else {
               return 5122;
            }
         } else {
            return 5120;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4277[5] + arg0 + ',' + (arg1 != null ? field4277[4] : field4277[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(I)V",
      line = 74
   )
   public static void method2301(int arg0) {
      try {
         if (arg0 == 4995) {
            field4273 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4277[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIIII)V",
      line = 87
   )
   public class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      try {
         this.field4262 = (byte)arg0;
         this.field4268 = (byte)arg1;
         this.field4271 = new int[4];
         this.field4274 = new int[4];
         this.field4265 = new int[4];
         this.field4274[3] = arg5;
         this.field4274[0] = arg2;
         this.field4274[2] = arg4;
         this.field4274[1] = arg3;
         this.field4265[3] = arg9;
         this.field4265[0] = arg6;
         this.field4265[1] = arg7;
         this.field4265[2] = arg8;
         this.field4271[1] = arg11;
         this.field4271[2] = arg12;
         this.field4271[0] = arg10;
         this.field4276 = (short)(arg2 >> class773.field11359);
         this.field4271[3] = arg13;
         this.field4270 = (short)(arg4 >> class773.field11359);
         this.field4266 = (short)(arg10 >> class773.field11359);
         this.field4267 = new short[4];
         this.field4263 = new short[4];
         this.field4269 = (short)(arg12 >> class773.field11359);
         this.field4264 = new short[4];
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field4277[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2302(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2303(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
