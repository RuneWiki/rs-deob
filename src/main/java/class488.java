import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class488 extends class70 {
   @OriginalMember(
      owner = "client!ch",
      name = "H",
      descriptor = "Ljava/lang/String;"
   )
   public String field7213;
   @OriginalMember(
      owner = "client!ch",
      name = "C",
      descriptor = "Ljca;"
   )
   public class712 field7218;
   @OriginalMember(
      owner = "client!ch",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7222 = new String[]{method3624(method3623("\f\u0005mno")), method3624(method3623("\u0019^/,")), method3624(method3623("\u0014Cm|{\u0019B7~:")), method3624(method3623("\u0014Cm\r:")), method3624(method3623("\u0014Cm\n:")), method3624(method3623("\u0014Cm\f:")), method3624(method3623("\u0014Cm\t:")), method3624(method3623("\u0014Cm\u000e:")), method3624(method3623("\u0014Cm\u000b:"))};
   @OriginalMember(
      owner = "client!ch",
      name = "B",
      descriptor = "Lpia;"
   )
   public static class102 field7215 = new class102("", 18);
   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "Lwia;"
   )
   public static class791 field7220 = new class791(32);
   @OriginalMember(
      owner = "client!ch",
      name = "E",
      descriptor = "I"
   )
   public static int field7210;
   @OriginalMember(
      owner = "client!ch",
      name = "y",
      descriptor = "I"
   )
   public int field7211;
   @OriginalMember(
      owner = "client!ch",
      name = "x",
      descriptor = "I"
   )
   public static int field7212;
   @OriginalMember(
      owner = "client!ch",
      name = "D",
      descriptor = "I"
   )
   public static int field7214;
   @OriginalMember(
      owner = "client!ch",
      name = "I",
      descriptor = "I"
   )
   public static int field7216;
   @OriginalMember(
      owner = "client!ch",
      name = "F",
      descriptor = "I"
   )
   public static int field7217;
   @OriginalMember(
      owner = "client!ch",
      name = "G",
      descriptor = "I"
   )
   public static int field7221;
   @OriginalMember(
      owner = "client!ch",
      name = "A",
      descriptor = "Llj;"
   )
   public static class633 field7219;

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(ILjfa;)Z",
      line = 4
   )
   public final boolean method3617(int arg0, class303 arg1) {
      try {
         ++field7214;
         int var3 = this.method3622(arg0 + 18);
         arg1.method699(12);
         --this.field7211;
         if (this.field7211 == arg0) {
            this.method2720(0);
            this.method699(12);
            --class554.field8214;
            class659.field9558.method5455(arg0 + -2049, this, arg1.field4330);
            return false;
         } else {
            return ~this.method3622(18) != ~var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7222[8] + arg0 + ',' + (arg1 != null ? field7222[0] : field7222[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "f",
      descriptor = "(I)V",
      line = 28
   )
   public static void method3618(int arg0) {
      try {
         field7215 = null;
         if (arg0 != 0) {
            field7215 = null;
         }

         field7219 = null;
         field7220 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7222[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(ZLjfa;)Z",
      line = 43
   )
   public final boolean method3619(boolean arg0, class303 arg1) {
      int var3 = client.field4530;

      try {
         ++field7210;
         if (arg0) {
            method3618(66);
         }

         boolean var4 = true;
         arg1.method699(12);
         class303 var5 = (class303)this.field7218.method5158(0);
         boolean var10000;
         if (var3 != 0) {
            var10000 = class441.method3336(1000, var5.field4333, arg1.field4333);
         } else if (var5 == null) {
            this.field7218.method5164(arg1, (byte)-105);
            ++this.field7211;
            var10000 = var4;
            if (var3 == 0) {
               return var4;
            }
         } else {
            var10000 = class441.method3336(1000, var5.field4333, arg1.field4333);
         }

         while(!var10000) {
            var5 = (class303)this.field7218.method5163((byte)123);
            var4 = false;
            if (var5 == null) {
               this.field7218.method5164(arg1, (byte)-105);
               ++this.field7211;
               var10000 = var4;
               if (var3 == 0) {
                  return var4;
               }
            } else {
               var10000 = class441.method3336(1000, var5.field4333, arg1.field4333);
            }
         }

         class613.method4456(arg1, (byte)-120, var5);
         ++this.field7211;
         if (var4) {
            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7222[6] + arg0 + ',' + (arg1 != null ? field7222[0] : field7222[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(IIBII)Z",
      line = 76
   )
   public static final boolean method3620(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field7216;
         if (class554.field8210 && class333.field4773) {
            if (~class171.field2123 > -101) {
               return false;
            } else if (!class499.method3722(arg4, arg3, 81, arg1)) {
               return false;
            } else if (arg2 < 84) {
               return true;
            } else {
               int var5 = arg4 << class459.field6950;
               int var6 = arg1 << class459.field6950;
               if (class783.method5629(var5, 2, var6, class768.field11264, class768.field11264, class377.field5711[arg3].method2235(arg1, 2116912585, arg4), arg0)) {
                  ++class556.field8259;
                  return true;
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7222[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 108
   )
   public static final void method3621(boolean arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field7221;
         if (arg1 != null) {
            if ((~class423.field6418 > -201 || class739.field10966) && class423.field6418 < 200) {
               String var3 = class70.method696((byte)-92, arg1);
               if (var3 != null) {
                  byte var10000;
                  label99: {
                     int var4 = 0;
                     if (var2 != 0) {
                        var10000 = -115;
                     } else if (~class423.field6418 >= ~var4) {
                        var10000 = 0;
                        if (var2 == 0) {
                           break label99;
                        }
                     } else {
                        var10000 = -115;
                     }

                     while(true) {
                        String var5 = class70.method696(var10000, class751.field11119[var4]);
                        if (var5 != null && var5.equals(var3)) {
                           class324.method2449(arg1 + class204.field2602.method1562((byte)-62, class728.field10827), 4, 27501);
                           return;
                        }

                        if (class787.field11446[var4] != null) {
                           String var6 = class70.method696((byte)-94, class787.field11446[var4]);
                           if (var6 != null && var6.equals(var3)) {
                              class324.method2449(arg1 + class204.field2602.method1562((byte)-67, class728.field10827), 4, 27501);
                              return;
                           }
                        }

                        ++var4;
                        if (~class423.field6418 >= ~var4) {
                           var10000 = 0;
                           if (var2 == 0) {
                              break;
                           }
                        } else {
                           var10000 = -115;
                        }
                     }
                  }

                  int var7 = var10000;
                  class180 var10;
                  if (var2 != 0) {
                     var10000 = -103;
                  } else if (class67.field821 <= var7) {
                     var10000 = class70.method696((byte)-92, class693.field10418.field10332).equals(var3);
                     if (var2 == 0) {
                        if (var10000 != 0) {
                           class324.method2449(class204.field2605.method1562((byte)-85, class728.field10827), 4, 27501);
                           return;
                        }

                        ++class408.field6223;
                        var10 = class486.method3603(class182.field2253, (byte)-109, class48.field583);
                        var10.field2211.method1085(class543.method4009(arg0, arg1), (byte)-11);
                        var10.field2211.method1101(arg1, -86);
                        class763.method5527(!arg0, var10);
                        return;
                     }
                  } else {
                     var10000 = -103;
                  }

                  while(true) {
                     String var8 = class70.method696(var10000, class590.field8725[var7]);
                     if (var8 != null && var8.equals(var3)) {
                        class324.method2449(class204.field2607.method1562((byte)-111, class728.field10827) + arg1 + class204.field2608.method1562((byte)-62, class728.field10827), 4, 27501);
                        return;
                     }

                     if (class289.field4050[var7] != null) {
                        String var9 = class70.method696((byte)-102, class289.field4050[var7]);
                        if (var9 != null && var9.equals(var3)) {
                           class324.method2449(class204.field2607.method1562((byte)-104, class728.field10827) + arg1 + class204.field2608.method1562((byte)-119, class728.field10827), 4, 27501);
                           return;
                        }
                     }

                     ++var7;
                     if (class67.field821 <= var7) {
                        var10000 = class70.method696((byte)-92, class693.field10418.field10332).equals(var3);
                        if (var2 == 0) {
                           if (var10000 != 0) {
                              class324.method2449(class204.field2605.method1562((byte)-85, class728.field10827), 4, 27501);
                              return;
                           }

                           ++class408.field6223;
                           var10 = class486.method3603(class182.field2253, (byte)-109, class48.field583);
                           var10.field2211.method1085(class543.method4009(arg0, arg1), (byte)-11);
                           var10.field2211.method1101(arg1, -86);
                           class763.method5527(!arg0, var10);
                           return;
                        }
                     } else {
                        var10000 = -103;
                     }
                  }
               }
            } else {
               class324.method2449(class204.field2575.method1562((byte)-118, class728.field10827), 4, 27501);
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field7222[7] + arg0 + ',' + (arg1 != null ? field7222[0] : field7222[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "g",
      descriptor = "(I)I",
      line = 206
   )
   public final int method3622(int arg0) {
      try {
         if (arg0 != 18) {
            return 108;
         } else {
            ++field7217;
            return this.field7218.field10622.field881 != this.field7218.field10622 ? ((class303)this.field7218.field10622.field881).field4333 : -1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7222[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 230
   )
   public class488(String arg0) {
      try {
         this.field7213 = arg0;
         this.field7218 = new class712();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7222[2] + (arg0 != null ? field7222[0] : field7222[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3623(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3624(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
