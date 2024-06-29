import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class483 {
   @OriginalMember(
      owner = "client!gt",
      name = "q",
      descriptor = "F"
   )
   public float field6899;
   @OriginalMember(
      owner = "client!gt",
      name = "n",
      descriptor = "F"
   )
   public float field6913;
   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "F"
   )
   public float field6909;
   @OriginalMember(
      owner = "client!gt",
      name = "i",
      descriptor = "F"
   )
   public float field6900;
   @OriginalMember(
      owner = "client!gt",
      name = "p",
      descriptor = "I"
   )
   public int field6911;
   @OriginalMember(
      owner = "client!gt",
      name = "d",
      descriptor = "I"
   )
   public int field6907;
   @OriginalMember(
      owner = "client!gt",
      name = "h",
      descriptor = "F"
   )
   public float field6902;
   @OriginalMember(
      owner = "client!gt",
      name = "l",
      descriptor = "F"
   )
   public float field6912;
   @OriginalMember(
      owner = "client!gt",
      name = "o",
      descriptor = "I"
   )
   public int field6905;
   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "I"
   )
   public int field6903;
   @OriginalMember(
      owner = "client!gt",
      name = "k",
      descriptor = "Llc;"
   )
   public class676 field6915;
   @OriginalMember(
      owner = "client!gt",
      name = "f",
      descriptor = "I"
   )
   public int field6904;
   @OriginalMember(
      owner = "client!gt",
      name = "s",
      descriptor = "I"
   )
   public int field6910;
   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6917 = new String[]{method3508(method3507("XJWMx")), method3508(method3507("D\u0010W&-")), method3508(method3507("XJWIx")), method3508(method3507("QK\u0015d")), method3508(method3507("XJWLx")), method3508(method3507("XJW49QW\r6x")), method3508(method3507("XJWJx")), method3508(method3507("XJWNx"))};
   @OriginalMember(
      owner = "client!gt",
      name = "r",
      descriptor = "[Lwf;"
   )
   public static class147[] field6906 = new class147[2048];
   @OriginalMember(
      owner = "client!gt",
      name = "j",
      descriptor = "I"
   )
   public static int field6898;
   @OriginalMember(
      owner = "client!gt",
      name = "c",
      descriptor = "I"
   )
   public static int field6901;
   @OriginalMember(
      owner = "client!gt",
      name = "g",
      descriptor = "I"
   )
   public static int field6908;
   @OriginalMember(
      owner = "client!gt",
      name = "m",
      descriptor = "I"
   )
   public static int field6914;
   @OriginalMember(
      owner = "client!gt",
      name = "e",
      descriptor = "I"
   )
   public static int field6916;

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Lwf;I)V",
      line = 4
   )
   public final void method3501(class147 arg0, int arg1) {
      try {
         ++field6898;
         this.field6913 = (float)(arg0.method1143(-15465) * 8) / 255.0F;
         if (arg1 != 23598) {
            method3506(-102, -95, -46, -31, 47);
         }

         this.field6909 = (float)(arg0.method1143(-15465) * 8) / 255.0F;
         this.field6899 = (float)(8 * arg0.method1143(arg1 ^ -24647)) / 255.0F;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6917[2] + (arg0 != null ? field6917[1] : field6917[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "()V",
      line = 149
   )
   public class483() {
      this.field6899 = 1.0F;
      this.field6913 = 1.0F;
      this.field6909 = 0.25F;

      try {
         this.field6900 = 1.2F;
         this.field6911 = class281.field3905;
         this.field6907 = -50;
         this.field6902 = 0.69921875F;
         this.field6912 = 1.1523438F;
         this.field6905 = -60;
         this.field6903 = -50;
         this.field6915 = class749.field11082;
         this.field6904 = class446.field6348;
         this.field6910 = 0;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6917[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "(Lwf;)V",
      line = 165
   )
   public class483(class147 arg0) {
      boolean var2 = client.field4360;
      super();
      this.field6899 = 1.0F;
      this.field6913 = 1.0F;
      this.field6909 = 0.25F;

      try {
         int var3;
         label114: {
            var3 = arg0.method1143(-15465);
            if (class300.field4107.field6431.method824(84) == 1 && class274.field3758.method593() > 0) {
               label105: {
                  if ((var3 & 1) == 0) {
                     this.field6904 = class446.field6348;
                     if (!var2) {
                        break label105;
                     }
                  }

                  this.field6904 = arg0.method1164(19693);
               }

               label100: {
                  if (~(var3 & 2) == -1) {
                     this.field6912 = 1.1523438F;
                     if (!var2) {
                        break label100;
                     }
                  }

                  this.field6912 = (float)arg0.method1211(-26166) / 256.0F;
               }

               label95: {
                  if ((var3 & 4) == 0) {
                     this.field6902 = 0.69921875F;
                     if (!var2) {
                        break label95;
                     }
                  }

                  this.field6902 = (float)arg0.method1211(-26166) / 256.0F;
               }

               if ((var3 & 8) != 0) {
                  this.field6900 = (float)arg0.method1211(-26166) / 256.0F;
                  if (!var2) {
                     break label114;
                  }
               }

               this.field6900 = 1.2F;
               if (!var2) {
                  break label114;
               }
            }

            if (~(var3 & 1) != -1) {
               arg0.method1164(19693);
            }

            if (~(2 & var3) != -1) {
               arg0.method1211(-26166);
            }

            if (~(4 & var3) != -1) {
               arg0.method1211(-26166);
            }

            if (~(8 & var3) != -1) {
               arg0.method1211(-26166);
            }

            this.field6902 = 0.69921875F;
            this.field6904 = class446.field6348;
            this.field6900 = 1.2F;
            this.field6912 = 1.1523438F;
         }

         label85: {
            if (~(var3 & 16) != -1) {
               this.field6903 = arg0.method1187((byte)110);
               this.field6905 = arg0.method1187((byte)-67);
               this.field6907 = arg0.method1187((byte)-86);
               if (!var2) {
                  break label85;
               }
            }

            this.field6907 = -50;
            this.field6905 = -60;
            this.field6903 = -50;
         }

         label80: {
            if (~(32 & var3) == -1) {
               this.field6911 = class281.field3905;
               if (!var2) {
                  break label80;
               }
            }

            this.field6911 = arg0.method1164(19693);
         }

         label75: {
            if (~(var3 & 64) == -1) {
               this.field6910 = 0;
               if (!var2) {
                  break label75;
               }
            }

            this.field6910 = arg0.method1211(-26166);
         }

         if (~(128 & var3) == -1) {
            this.field6915 = class749.field11082;
         } else {
            int var4 = arg0.method1211(-26166);
            int var5 = arg0.method1211(-26166);
            int var6 = arg0.method1211(-26166);
            int var7 = arg0.method1211(-26166);
            int var8 = arg0.method1211(-26166);
            int var9 = arg0.method1211(-26166);
            this.field6915 = class447.method3280(var8, var4, var6, (byte)-5, var5, var9, var7);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field6917[5] + (arg0 != null ? field6917[1] : field6917[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(ILgt;)Z",
      line = 37
   )
   public final boolean method3502(int arg0, class483 arg1) {
      try {
         if (arg0 != -1) {
            method3504((byte)44);
         }

         ++field6901;
         return ~this.field6904 == ~arg1.field6904 && this.field6912 == arg1.field6912 && this.field6902 == arg1.field6902 && this.field6900 == arg1.field6900 && this.field6909 == arg1.field6909 && this.field6913 == arg1.field6913 && this.field6899 == arg1.field6899 && ~this.field6911 == ~arg1.field6911 && this.field6910 == arg1.field6910 && this.field6915 == arg1.field6915;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6917[4] + arg0 + ',' + (arg1 != null ? field6917[1] : field6917[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(IIILta;)V",
      line = 49
   )
   public static final void method3503(int arg0, int arg1, int arg2, class226 arg3) {
      class517 var4 = class179.method1431(arg0, arg1, arg2);
      if (var4 != null) {
         var4.field7464 = arg3;
         int var5 = class757.field11220 == class731.field10698 ? 1 : 0;
         if (arg3.method253((byte)41)) {
            if (arg3.method238((byte)103)) {
               arg3.field10695 = class392.field5677[var5];
               class392.field5677[var5] = arg3;
               return;
            }

            arg3.field10695 = class591.field8705[var5];
            class591.field8705[var5] = arg3;
            class171.field2384 = true;
            return;
         }

         arg3.field10695 = class756.field11204[var5];
         class756.field11204[var5] = arg3;
      }

   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(B)V",
      line = 81
   )
   public static final void method3504(byte arg0) {
      try {
         ++field6914;
         if (!class595.field8747) {
            class595.method4318(class121.field1554, 63);
            if (arg0 != -114) {
               field6916 = 122;
            }

            if (class75.field933 != null) {
               class595.method4318(class75.field933, 48);
            }

            class595.field8747 = true;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6917[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(B)V",
      line = 112
   )
   public static void method3505(byte arg0) {
      try {
         if (arg0 <= -21) {
            field6906 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6917[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(IIIII)V",
      line = 127
   )
   public static final void method3506(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         label20: {
            if (~arg2 <= ~arg1) {
               class149.method1249(-7, arg1, arg0, class341.field4631[arg3], arg2);
               if (!client.field4360) {
                  break label20;
               }
            }

            class149.method1249(-7, arg2, arg0, class341.field4631[arg3], arg1);
         }

         if (arg4 == 0) {
            ++field6908;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6917[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3508(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
