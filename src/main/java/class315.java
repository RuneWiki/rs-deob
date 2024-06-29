import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class315 extends class465 {
   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4510 = new String[]{method2378(method2377("\\#xdO")), method2378(method2377("\\#x`O")), method2378(method2377("\\#xgO")), method2378(method2377("Jxx\b\u001a")), method2378(method2377("_#:J")), method2378(method2377("\\#xnO")), method2378(method2377("\\#xaO")), method2378(method2377("\\#xoO")), method2378(method2377("\\#xbO")), method2378(method2377("\\#xcO")), method2378(method2377("\\#xeO"))};
   @OriginalMember(
      owner = "client!mu",
      name = "h",
      descriptor = "I"
   )
   public static int field4500 = 0;
   @OriginalMember(
      owner = "client!mu",
      name = "n",
      descriptor = "I"
   )
   public static int field4506 = 0;
   @OriginalMember(
      owner = "client!mu",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field4508 = false;
   @OriginalMember(
      owner = "client!mu",
      name = "k",
      descriptor = "I"
   )
   public static int field4498;
   @OriginalMember(
      owner = "client!mu",
      name = "l",
      descriptor = "I"
   )
   public static int field4499;
   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "I"
   )
   public static int field4501;
   @OriginalMember(
      owner = "client!mu",
      name = "q",
      descriptor = "I"
   )
   public static int field4502;
   @OriginalMember(
      owner = "client!mu",
      name = "j",
      descriptor = "I"
   )
   public static int field4503;
   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "I"
   )
   public static int field4504;
   @OriginalMember(
      owner = "client!mu",
      name = "m",
      descriptor = "I"
   )
   public static int field4505;
   @OriginalMember(
      owner = "client!mu",
      name = "o",
      descriptor = "I"
   )
   public static int field4507;
   @OriginalMember(
      owner = "client!mu",
      name = "p",
      descriptor = "I"
   )
   public static int field4509;

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method2372(int arg0) {
      try {
         if (arg0 <= 81) {
            return -72;
         } else {
            ++field4498;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4510[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      line = 20
   )
   public static final String method2373(String param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IB)I",
      line = 99
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field4505;
         if (class271.method2093(arg0, -84)) {
            if (super.field6980.field9464.method4223((byte)-6) && !class57.method480(70, super.field6980.field9464.method4225(127))) {
               return 3;
            }

            if (~super.field6980.field9438.method4352(110) == -2) {
               return 3;
            }
         }

         int var3 = -123 % ((-51 - arg1) / 60);
         if (~arg0 == -4) {
            return 3;
         } else {
            return class271.method2093(arg0, -21) ? 2 : 1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4510[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(II)V",
      line = 129
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field4499;
         super.field6984 = arg1;
         if (arg0 != -14812) {
            field4500 = 112;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4510[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I)I",
      line = 144
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            field4508 = false;
         }

         ++field4503;
         return 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4510[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(Z)Z",
      line = 155
   )
   public final boolean method2374(boolean arg0) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field4504;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4510[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 166
   )
   public class315(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Ljava/lang/String;BZ)V",
      line = 169
   )
   public static final void method2375(String arg0, byte arg1, boolean arg2) {
      int var3 = client.field4530;

      try {
         ++field4501;
         if (arg0 != null) {
            if (~class67.field821 <= -101) {
               class324.method2449(class204.field2603.method1562((byte)-94, class728.field10827), 4, 27501);
            } else {
               String var4 = class70.method696((byte)-125, arg0);
               if (var4 != null) {
                  int var5 = 0;
                  String var6;
                  String var7;
                  if (var3 != 0) {
                     var6 = class70.method696((byte)-112, class590.field8725[var5]);
                     if (var6 != null && var6.equals(var4)) {
                        class324.method2449(arg0 + class204.field2604.method1562((byte)-92, class728.field10827), 4, 27501);
                        return;
                     }

                     if (class289.field4050[var5] != null) {
                        var7 = class70.method696((byte)-83, class289.field4050[var5]);
                        if (var7 != null && var7.equals(var4)) {
                           class324.method2449(arg0 + class204.field2604.method1562((byte)-81, class728.field10827), 4, arg1 + 27503);
                           return;
                        }
                     }

                     ++var5;
                  }

                  while(true) {
                     byte var10000;
                     if (class67.field821 <= var5) {
                        var10000 = arg1;
                        if (var3 == 0) {
                           if (arg1 != -2) {
                              method2373((String)null, (byte)116);
                           }

                           int var8 = 0;
                           class180 var11;
                           if (var3 != 0) {
                              var10000 = -96;
                           } else if (~var8 <= ~class423.field6418) {
                              var10000 = class70.method696((byte)-87, class693.field10418.field10332).equals(var4);
                              if (var3 == 0) {
                                 if (var10000 != 0) {
                                    class324.method2449(class204.field2606.method1562((byte)-63, class728.field10827), 4, arg1 + 27503);
                                    return;
                                 }

                                 ++class148.field1856;
                                 var11 = class486.method3603(class234.field2973, (byte)-65, class48.field583);
                                 var11.field2211.method1085(class543.method4009(true, arg0) - -1, (byte)-11);
                                 var11.field2211.method1101(arg0, arg1 ^ 125);
                                 var11.field2211.method1085(arg2 ? 1 : 0, (byte)-11);
                                 class763.method5527(false, var11);
                                 return;
                              }
                           } else {
                              var10000 = -96;
                           }

                           while(true) {
                              String var9 = class70.method696(var10000, class751.field11119[var8]);
                              if (var9 != null && var9.equals(var4)) {
                                 class324.method2449(class204.field2609.method1562((byte)-117, class728.field10827) + arg0 + class204.field2610.method1562((byte)-125, class728.field10827), 4, arg1 ^ -27501);
                                 return;
                              }

                              if (class787.field11446[var8] != null) {
                                 String var10 = class70.method696((byte)-84, class787.field11446[var8]);
                                 if (var10 != null && var10.equals(var4)) {
                                    class324.method2449(class204.field2609.method1562((byte)-127, class728.field10827) + arg0 + class204.field2610.method1562((byte)-73, class728.field10827), 4, 27501);
                                    return;
                                 }
                              }

                              ++var8;
                              if (~var8 <= ~class423.field6418) {
                                 var10000 = class70.method696((byte)-87, class693.field10418.field10332).equals(var4);
                                 if (var3 == 0) {
                                    if (var10000 != 0) {
                                       class324.method2449(class204.field2606.method1562((byte)-63, class728.field10827), 4, arg1 + 27503);
                                       return;
                                    }

                                    ++class148.field1856;
                                    var11 = class486.method3603(class234.field2973, (byte)-65, class48.field583);
                                    var11.field2211.method1085(class543.method4009(true, arg0) - -1, (byte)-11);
                                    var11.field2211.method1101(arg0, arg1 ^ 125);
                                    var11.field2211.method1085(arg2 ? 1 : 0, (byte)-11);
                                    class763.method5527(false, var11);
                                    return;
                                 }
                              } else {
                                 var10000 = -96;
                              }
                           }
                        }
                     } else {
                        var10000 = -112;
                     }

                     var6 = class70.method696(var10000, class590.field8725[var5]);
                     if (var6 != null && var6.equals(var4)) {
                        class324.method2449(arg0 + class204.field2604.method1562((byte)-92, class728.field10827), 4, 27501);
                        return;
                     }

                     if (class289.field4050[var5] != null) {
                        var7 = class70.method696((byte)-83, class289.field4050[var5]);
                        if (var7 != null && var7.equals(var4)) {
                           class324.method2449(arg0 + class204.field2604.method1562((byte)-81, class728.field10827), 4, arg1 + 27503);
                           return;
                        }
                     }

                     ++var5;
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field4510[5] + (arg0 != null ? field4510[3] : field4510[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(I)Z",
      line = 264
   )
   public final boolean method2376(int arg0) {
      try {
         ++field4509;
         if (arg0 <= 12) {
            method2375((String)null, (byte)51, false);
         }

         return class271.method2093(super.field6984, -66);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4510[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Z)V",
      line = 275
   )
   public final void method69(boolean arg0) {
      try {
         if (this.method2376(107)) {
            if (super.field6980.field9464.method4223((byte)-36) && !class57.method480(57, super.field6980.field9464.method4225(102))) {
               super.field6984 = 1;
            }

            if (super.field6980.field9438.method4352(114) == 1) {
               super.field6984 = 1;
            }
         }

         ++field4507;
         if (super.field6984 == 3) {
            super.field6984 = 2;
         }

         if (super.field6984 < 0 || ~super.field6984 < -4) {
            super.field6984 = this.method78(16726277);
         }

         if (arg0) {
            field4506 = -88;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4510[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 306
   )
   public class315(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2377(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2378(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
