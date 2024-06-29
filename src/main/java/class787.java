import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class787 {
   @OriginalMember(
      owner = "client!nca",
      name = "h",
      descriptor = "Lwv;"
   )
   private class37 field11556 = new class37(256);
   @OriginalMember(
      owner = "client!nca",
      name = "c",
      descriptor = "Lwv;"
   )
   private class37 field11562 = new class37(256);
   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "Lkf;"
   )
   private class266 field11550;
   @OriginalMember(
      owner = "client!nca",
      name = "i",
      descriptor = "Lkf;"
   )
   private class266 field11560;
   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11564 = new String[]{method5687(method5686("TNZ\u001fk")), method5687(method5686("A\u0003\u0015\u001fQ\u0007")), method5687(method5686("A\u0015\u0018]")), method5687(method5686("B\u0001\u0017")), method5687(method5686("G\u0001\u0002TpF\u0012\u0011WyW")), method5687(method5686("A\u0003\u0015\u001fS\u0007")), method5687(method5686("X\t\u001a")), method5687(method5686("G\u0001\u0002T\u007fJV")), method5687(method5686("A\u0003\u0015\u001f]\u0007")), method5687(method5686("A\u0003\u0015\u001fP\u0007")), method5687(method5686("A\u0003\u0015\u001f*F\u000e\u001dE(\u0007")), method5687(method5686("A\u0003\u0015\u001f_\u0007")), method5687(method5686("A\u0003\u0015\u001fW\u0007")), method5687(method5686("A\u0003\u0015\u001fT\u0007")), method5687(method5686("A\u0003\u0015\u001fR\u0007")), method5687(method5686("A\u0003\u0015\u001f\\\u0007")), method5687(method5686("A\u0003\u0015\u001fU\u0007")), method5687(method5686("A\u0003\u0015\u001f^\u0007"))};
   @OriginalMember(
      owner = "client!nca",
      name = "l",
      descriptor = "I"
   )
   public static int field11559 = 0;
   @OriginalMember(
      owner = "client!nca",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field11563 = new int[1];
   @OriginalMember(
      owner = "client!nca",
      name = "m",
      descriptor = "I"
   )
   public static int field11548;
   @OriginalMember(
      owner = "client!nca",
      name = "d",
      descriptor = "I"
   )
   public static int field11549;
   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "I"
   )
   public static int field11551;
   @OriginalMember(
      owner = "client!nca",
      name = "p",
      descriptor = "I"
   )
   public static int field11552;
   @OriginalMember(
      owner = "client!nca",
      name = "o",
      descriptor = "I"
   )
   public static int field11553;
   @OriginalMember(
      owner = "client!nca",
      name = "g",
      descriptor = "I"
   )
   public static int field11554;
   @OriginalMember(
      owner = "client!nca",
      name = "f",
      descriptor = "I"
   )
   public static int field11555;
   @OriginalMember(
      owner = "client!nca",
      name = "k",
      descriptor = "I"
   )
   public static int field11557;
   @OriginalMember(
      owner = "client!nca",
      name = "n",
      descriptor = "I"
   )
   public static int field11558;
   @OriginalMember(
      owner = "client!nca",
      name = "e",
      descriptor = "I"
   )
   public static int field11561;

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(II)Z",
      line = 3
   )
   public static final boolean method5675(int arg0, int arg1) {
      try {
         if (arg1 > -48) {
            method5681(123);
         }

         ++field11549;
         return ~arg0 == -4 || ~arg0 == -5 || ~arg0 == -6 || arg0 == 6;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11564[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "(I[II)Lvea;",
      line = 17
   )
   public final class289 method5676(int arg0, int[] arg1, int arg2) {
      try {
         ++field11561;
         if (this.field11560.method2027((byte)-119) == 1) {
            return this.method5684(false, arg2, 0, arg1);
         } else if (arg0 != -20876) {
            return null;
         } else if (this.field11560.method2060(2, arg2) == 1) {
            return this.method5684(false, 0, arg2, arg1);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11564[9] + arg0 + ',' + (arg1 != null ? field11564[0] : field11564[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(I[IBI)Lvea;",
      line = 40
   )
   private final class289 method5677(int arg0, int[] arg1, byte arg2, int arg3) {
      try {
         ++field11555;
         int var5 = (arg3 << 4 & 65528 | arg3 >>> 12) ^ arg0;
         int var6 = var5 | arg3 << 16;
         long var7 = 4294967296L ^ (long)var6;
         class289 var9 = (class289)this.field11562.method329((byte)-8, var7);
         if (var9 != null) {
            return var9;
         } else {
            if (arg2 > -79) {
               this.field11562 = null;
            }

            if (arg1 != null && ~arg1[0] >= -1) {
               return null;
            } else {
               class332 var10 = (class332)this.field11556.method329((byte)-108, var7);
               if (var10 == null) {
                  var10 = class332.method2451(this.field11550, arg3, arg0);
                  if (var10 == null) {
                     return null;
                  }

                  this.field11556.method336(-1, var7, var10);
               }

               class289 var11 = var10.method2458(arg1);
               if (var11 == null) {
                  return null;
               } else {
                  var10.method3165(127);
                  this.field11562.method336(-1, var7, var11);
                  return var11;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field11564[11] + arg0 + ',' + (arg1 != null ? field11564[0] : field11564[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(BII)Z",
      line = 82
   )
   public static final boolean method5678(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != 8) {
            field11563 = null;
         }

         ++field11551;
         return ~(arg2 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11564[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(I)Z",
      line = 95
   )
   public static final boolean method5679(int arg0) {
      try {
         ++field11557;
         if (class794.field11621 == null) {
            return false;
         } else {
            if (class794.field11621.field458 >= arg0) {
               class794.field11621.field458 -= 2000;
            }

            return class794.field11621.field458 == 1006;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11564[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(ZLjava/lang/String;Ljava/lang/String;ZBLnu;)V",
      line = 116
   )
   public static final void method5680(boolean arg0, String arg1, String arg2, boolean arg3, byte arg4, class619 arg5) {
      try {
         ++field11552;
         if (arg4 != 18) {
            field11563 = null;
         }

         if (!arg3) {
            class573.method4127(arg1, 3, arg5, -87);
         } else {
            if (class619.field9120.startsWith(field11564[6]) && arg5.field9134) {
               String var6 = null;
               if (class216.field3093 != null) {
                  var6 = class216.field3093.getParameter(field11564[7]);
               }

               if (var6 == null || !var6.equals("1")) {
                  class296 var7 = class573.method4127(arg1, 0, arg5, -67);
                  class236.field3292 = var7;
                  class773.field11362 = arg1;
                  class294.field4055 = arg5;
                  return;
               }
            }

            if (class619.field9120.startsWith(field11564[3])) {
               String var8 = null;
               if (class216.field3093 != null) {
                  var8 = class216.field3093.getParameter(field11564[4]);
               }

               if (var8 != null && var8.equals("1") && arg0) {
                  class676.method4913(1, arg1, (byte)-67, arg5, arg2);
                  return;
               }
            }

            class573.method4127(arg1, 2, arg5, 102);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field11564[5] + arg0 + ',' + (arg1 != null ? field11564[0] : field11564[2]) + ',' + (arg2 != null ? field11564[0] : field11564[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11564[0] : field11564[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "(I)V",
      line = 179
   )
   public static void method5681(int arg0) {
      try {
         if (arg0 == -8768) {
            field11563 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11564[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(ZLrv;)V",
      line = 191
   )
   public static final void method5682(boolean arg0, class121 arg1) {
      try {
         if (!arg0) {
            field11563 = null;
         }

         ++field11554;
         class460 var2 = (class460)class9.field89.method329((byte)-103, (long)arg1.field3862);
         if (var2 != null) {
            if (var2.field6614 != null) {
               class280.field3897.method4815(var2.field6614);
               var2.field6614 = null;
            }

            var2.method3165(126);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11564[12] + arg0 + ',' + (arg1 != null ? field11564[0] : field11564[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(I[II)Lvea;",
      line = 226
   )
   public final class289 method5683(int arg0, int[] arg1, int arg2) {
      try {
         ++field11553;
         if (this.field11550.method2027((byte)-97) == 1) {
            return this.method5677(arg0, arg1, (byte)-85, 0);
         } else if (arg2 != -998493968) {
            return null;
         } else if (this.field11550.method2060(2, arg0) == 1) {
            return this.method5677(0, arg1, (byte)-106, arg0);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11564[1] + arg0 + ',' + (arg1 != null ? field11564[0] : field11564[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(ZII[I)Lvea;",
      line = 250
   )
   private final class289 method5684(boolean arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field11548;
         int var5 = (arg2 >>> 12 | (arg2 & -268431361) << 4) ^ arg1;
         int var6 = var5 | arg2 << 16;
         long var7 = (long)var6;
         class289 var9 = (class289)this.field11562.method329((byte)108, var7);
         if (var9 != null) {
            return var9;
         } else if (arg0) {
            return null;
         } else if (arg3 != null && arg3[0] <= 0) {
            return null;
         } else {
            class344 var10 = class344.method2524(this.field11560, arg2, arg1);
            if (var10 == null) {
               return null;
            } else {
               class289 var11 = var10.method2522();
               this.field11562.method336(-1, var7, var11);
               if (arg3 != null) {
                  arg3[0] -= var11.field4006.length;
               }

               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field11564[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11564[0] : field11564[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "<init>",
      descriptor = "(Lkf;Lkf;)V",
      line = 364
   )
   public class787(class266 arg0, class266 arg1) {
      try {
         this.field11550 = arg1;
         this.field11560 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11564[10] + (arg0 != null ? field11564[0] : field11564[2]) + ',' + (arg1 != null ? field11564[0] : field11564[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(IIIIBII)Z",
      line = 298
   )
   public static final boolean method5685(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         ++field11558;
         if (arg4 <= 10) {
            return false;
         } else {
            int var7 = arg0 - -arg3;
            int var8 = arg5 - -arg6;
            int var9 = arg1 + arg2;
            if (!class247.method1873(arg0, var7, var8, var8, var8, var9, var9, false, arg0, arg1)) {
               return false;
            } else if (!class247.method1873(arg0, var7, var8, var8, var8, arg1, var9, false, var7, arg1)) {
               return false;
            } else {
               if (~class225.field3201 < ~arg0) {
                  if (!class247.method1873(arg0, arg0, var8, var8, arg5, arg1, var9, false, arg0, var9)) {
                     return false;
                  }

                  if (!class247.method1873(arg0, arg0, var8, arg5, arg5, arg1, arg1, false, arg0, var9)) {
                     return false;
                  }
               } else {
                  if (!class247.method1873(var7, var7, var8, var8, arg5, arg1, var9, false, var7, var9)) {
                     return false;
                  }

                  if (!class247.method1873(var7, var7, var8, arg5, arg5, arg1, arg1, false, var7, var9)) {
                     return false;
                  }
               }

               if (class84.field1093 > arg1) {
                  if (!class247.method1873(arg0, var7, var8, var8, arg5, arg1, arg1, false, arg0, arg1)) {
                     return false;
                  }

                  if (!class247.method1873(arg0, var7, var8, arg5, arg5, arg1, arg1, false, var7, arg1)) {
                     return false;
                  }
               } else {
                  if (!class247.method1873(arg0, var7, var8, var8, arg5, var9, var9, false, arg0, var9)) {
                     return false;
                  }

                  if (!class247.method1873(arg0, var7, var8, arg5, arg5, var9, var9, false, var7, var9)) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field11564[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5686(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5687(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
