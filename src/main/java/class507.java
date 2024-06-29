import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class507 {
   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "Let;"
   )
   private class389 field7758 = new class389(256);
   @OriginalMember(
      owner = "client!jo",
      name = "e",
      descriptor = "Let;"
   )
   private class389 field7769 = new class389(256);
   @OriginalMember(
      owner = "client!jo",
      name = "g",
      descriptor = "Lrr;"
   )
   private class678 field7765;
   @OriginalMember(
      owner = "client!jo",
      name = "l",
      descriptor = "Lrr;"
   )
   private class678 field7762;
   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7770 = new String[]{method3941(method3940("]SV\u000e\"")), method3941(method3940("]SV\u000b\"")), method3941(method3940("YI\u0014&")), method3941(method3940("L\u0012Vdw")), method3941(method3940("]SV\f\"")), method3941(method3940("]SV\u000f\"")), method3941(method3940("]SVvcYU\ft\"")), method3941(method3940("]SV\t\"")), method3941(method3940("]SV\b\""))};
   @OriginalMember(
      owner = "client!jo",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field7761 = new int[3];
   @OriginalMember(
      owner = "client!jo",
      name = "h",
      descriptor = "Let;"
   )
   public static class389 field7766 = new class389(8);
   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "I"
   )
   public static int field7768 = 0;
   @OriginalMember(
      owner = "client!jo",
      name = "k",
      descriptor = "I"
   )
   public static int field7759;
   @OriginalMember(
      owner = "client!jo",
      name = "d",
      descriptor = "I"
   )
   public static int field7760;
   @OriginalMember(
      owner = "client!jo",
      name = "c",
      descriptor = "I"
   )
   public static int field7763;
   @OriginalMember(
      owner = "client!jo",
      name = "f",
      descriptor = "I"
   )
   public static int field7764;
   @OriginalMember(
      owner = "client!jo",
      name = "i",
      descriptor = "I"
   )
   public static int field7767;

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(IBI[I)Lec;",
      line = 9
   )
   private final class184 method3934(int arg0, byte arg1, int arg2, int[] arg3) {
      try {
         ++field7760;
         int var5 = arg0 ^ ((1610616831 & arg2) << 4 | arg2 >>> 12);
         int var6 = var5 | arg2 << 16;
         long var7 = 4294967296L ^ (long)var6;
         if (arg1 != 12) {
            field7761 = null;
         }

         class184 var9 = (class184)this.field7769.method3141(var7, true);
         if (var9 != null) {
            return var9;
         } else if (arg3 != null && ~arg3[0] >= -1) {
            return null;
         } else {
            class617 var10 = (class617)this.field7758.method3141(var7, true);
            if (var10 == null) {
               var10 = class617.method4534(this.field7762, arg2, arg0);
               if (var10 == null) {
                  return null;
               }

               this.field7758.method3143(arg1 + 35, var10, var7);
            }

            class184 var11 = var10.method4536(arg3);
            if (var11 == null) {
               return null;
            } else {
               var10.method2477(arg1 + 1964);
               this.field7769.method3143(82, var11, var7);
               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field7770[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7770[3] : field7770[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(II[II)Lec;",
      line = 63
   )
   private final class184 method3935(int arg0, int arg1, int[] arg2, int arg3) {
      try {
         ++field7764;
         int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & -268431361) << 4);
         int var6 = var5 | arg0 << 16;
         long var7 = (long)var6;
         class184 var9 = (class184)this.field7769.method3141(var7, true);
         if (var9 != null) {
            return var9;
         } else if (arg2 != null && arg2[0] <= 0) {
            return null;
         } else {
            class138 var10 = class138.method1275(this.field7765, arg0, arg3);
            if (var10 == null) {
               return null;
            } else {
               int var11 = 2 % (arg1 / 33);
               class184 var12 = var10.method1277();
               this.field7769.method3143(90, var12, var7);
               if (arg2 != null) {
                  arg2[0] -= var12.field2891.length;
               }

               return var12;
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7770[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7770[3] : field7770[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "([IIB)Lec;",
      line = 100
   )
   public final class184 method3936(int[] arg0, int arg1, byte arg2) {
      try {
         ++field7763;
         int var4 = 22 / ((70 - arg2) / 56);
         if (this.field7765.method5008(-1) == 1) {
            return this.method3935(0, -116, arg0, arg1);
         } else if (~this.field7765.method4998((byte)-82, arg1) == -2) {
            return this.method3935(arg1, 101, arg0, 0);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7770[4] + (arg0 != null ? field7770[3] : field7770[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(BI[I)Lec;",
      line = 118
   )
   public final class184 method3937(byte arg0, int arg1, int[] arg2) {
      try {
         ++field7759;
         if (this.field7762.method5008(-1) == 1) {
            return this.method3934(arg1, (byte)12, 0, arg2);
         } else if (arg0 != -110) {
            return null;
         } else if (~this.field7762.method4998((byte)-82, arg1) == -2) {
            return this.method3934(0, (byte)12, arg1, arg2);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7770[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7770[3] : field7770[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(I)V",
      line = 143
   )
   public static void method3938(int arg0) {
      try {
         field7766 = null;
         if (arg0 != -2) {
            method3939((class119)null, (int[])null, (int[])null, (int[])null, false);
         }

         field7761 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7770[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(Luaa;[I[I[IZ)V",
      line = 154
   )
   public static final void method3939(class119 arg0, int[] arg1, int[] arg2, int[] arg3, boolean arg4) {
      boolean var5 = client.field1786;

      try {
         if (arg4) {
            ++field7767;
            int var6 = 0;
            if (var5 || ~var6 > ~arg1.length) {
               int var10000;
               int var10001;
               label154:
               do {
                  label152:
                  do {
                     int var7 = arg1[var6];
                     int var8 = arg2[var6];
                     int var9 = arg3[var6];
                     int var10 = 0;
                     if (!var5) {
                        if (var8 == 0) {
                           ++var6;
                           continue;
                        }

                        var10000 = ~var10;
                        var10001 = ~arg0.field1670.length;
                        if (var5) {
                           continue label154;
                        }

                        if (var10000 <= var10001) {
                           ++var6;
                           continue;
                        }
                     }

                     do {
                        if ((1 & var8) != 0) {
                           if (var7 != -1) {
                              class82 var11 = class314.field4861.method4845(var7, false);
                              int var12 = var11.field1186;
                              class681 var13 = arg0.field1670[var10];
                              if (var13 != null && var13.method2991(40)) {
                                 if (~var7 == ~var13.method2995((byte)104)) {
                                    if (var12 == 0) {
                                       var13 = arg0.field1670[var10] = null;
                                    } else {
                                       label124: {
                                          if (var12 == 1) {
                                             var13.method2974(1);
                                             var13.field10156 = var9;
                                             if (!var5) {
                                                break label124;
                                             }
                                          }

                                          if (~var12 == -3) {
                                             var13.method2980(0);
                                             if (var5 && var11.field1165 >= var13.method2975(false).field1165) {
                                                var13 = arg0.field1670[var10] = null;
                                             }
                                          }
                                       }
                                    }
                                 } else if (var11.field1165 >= var13.method2975(false).field1165) {
                                    var13 = arg0.field1670[var10] = null;
                                 }
                              }

                              if (var13 != null && var13.method2991(83)) {
                                 var8 >>>= 1;
                                 ++var10;
                              } else {
                                 class681 var14 = arg0.field1670[var10] = new class681(arg0);
                                 var14.method2981(var7, 0);
                                 var14.field10156 = var9;
                                 if (var5) {
                                    arg0.field1670[var10] = null;
                                 }

                                 var8 >>>= 1;
                                 ++var10;
                              }
                           } else {
                              arg0.field1670[var10] = null;
                              var8 >>>= 1;
                              ++var10;
                           }
                        } else {
                           var8 >>>= 1;
                           ++var10;
                        }

                        if (var8 == 0) {
                           ++var6;
                           continue label152;
                        }

                        var10000 = ~var10;
                        var10001 = ~arg0.field1670.length;
                        if (var5) {
                           continue label154;
                        }
                     } while(var10000 > var10001);

                     ++var6;
                  } while(~var6 > ~arg1.length);

                  return;
               } while(var10000 > var10001);

            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field7770[5] + (arg0 != null ? field7770[3] : field7770[2]) + ',' + (arg1 != null ? field7770[3] : field7770[2]) + ',' + (arg2 != null ? field7770[3] : field7770[2]) + ',' + (arg3 != null ? field7770[3] : field7770[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "<init>",
      descriptor = "(Lrr;Lrr;)V",
      line = 255
   )
   public class507(class678 arg0, class678 arg1) {
      try {
         this.field7765 = arg0;
         this.field7762 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7770[6] + (arg0 != null ? field7770[3] : field7770[2]) + ',' + (arg1 != null ? field7770[3] : field7770[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3940(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3941(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
