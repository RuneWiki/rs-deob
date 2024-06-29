import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class732 {
   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10864 = new String[]{method5327(method5326("\u0017M$e?")), method5327(method5326("\b\u0007$\u000ej")), method5327(method5326("\u0002\u0016f'")), method5327(method5326("\b\u0007$\tj")), method5327(method5326("\b\u0007$\nj")), method5327(method5326("\b\u0007$\u000fj")), method5327(method5326("\b\u0007$\bj"))};
   @OriginalMember(
      owner = "client!dd",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10857 = new int[200];
   @OriginalMember(
      owner = "client!dd",
      name = "e",
      descriptor = "I"
   )
   public static int field10856;
   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "I"
   )
   public static int field10858;
   @OriginalMember(
      owner = "client!dd",
      name = "c",
      descriptor = "I"
   )
   public static int field10860;
   @OriginalMember(
      owner = "client!dd",
      name = "d",
      descriptor = "I"
   )
   public static int field10861;
   @OriginalMember(
      owner = "client!dd",
      name = "f",
      descriptor = "I"
   )
   public static int field10862;
   @OriginalMember(
      owner = "client!dd",
      name = "b",
      descriptor = "I"
   )
   public static int field10863;
   @OriginalMember(
      owner = "client!dd",
      name = "i",
      descriptor = "Lua;"
   )
   public static class693 field10859;
   @OriginalMember(
      owner = "client!dd",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field10855;

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5321(boolean arg0) {
      int var1 = client.field4530;

      try {
         ++field10862;
         class140.method1188(class331.field4741, (byte)28);
         ++class204.field2630;
         if (class388.field5935 && class660.field9562) {
            int var2 = 0;
            int var3 = 0;
            if (class446.field6785) {
               var2 = class325.method2458(29461);
               var3 = class319.method2421(true);
            }

            int var4 = class723.field10766.method368((byte)106) - -var2;
            int var5 = class723.field10766.method366(true) - -var3;
            if (arg0) {
               method5322(-58, -9, 93, (byte)-32, 77, -121);
            }

            int var6 = var5 - class64.field792;
            int var7 = var4 - class430.field6583;
            if (~var7 > ~class49.field595) {
               var7 = class49.field595;
            }

            if (~var6 > ~class78.field978) {
               var6 = class78.field978;
            }

            if (~(var7 - -class331.field4741.field7986) < ~(class49.field595 + class741.field11002.field7986)) {
               var7 = -class331.field4741.field7986 + class49.field595 + class741.field11002.field7986;
            }

            if (class78.field978 + class741.field11002.field7954 < class331.field4741.field7954 + var6) {
               var6 = class78.field978 + class741.field11002.field7954 + -class331.field4741.field7954;
            }

            int var8 = class741.field11002.field8060 + var7 + -class49.field595;
            int var9 = var6 - -class741.field11002.field7962 + -class78.field978;
            if (!class723.field10766.method429(-1)) {
               label119: {
                  if (!class213.field2708) {
                     if (class315.field4500 != 1 && !class154.method1272(true) || ~class354.field5375 >= -3) {
                        if (!class352.method2749((byte)11)) {
                           break label119;
                        }

                        class328.method2470(21385, class430.field6583 - -class137.field1781, class64.field792 - -class751.field11118);
                        if (var1 == 0) {
                           break label119;
                        }
                     }

                     class328.method2470(21385, class430.field6583 + class137.field1781, class751.field11118 + class64.field792);
                     if (var1 == 0) {
                        break label119;
                     }
                  }

                  class8.method76(30687);
                  if (class331.field4741.field8089 != null) {
                     class662 var10 = new class662();
                     var10.field9589 = class331.field4741;
                     var10.field9591 = var9;
                     var10.field9594 = var8;
                     var10.field9595 = class331.field4741.field8089;
                     var10.field9585 = class416.field6361;
                     class265.method2019(var10);
                  }

                  if (class416.field6361 != null && client.method2380(class331.field4741) != null) {
                     class409.method3123(class331.field4741, class416.field6361, (byte)-47);
                  }
               }

               class331.field4741 = null;
            } else {
               if (~class204.field2630 < ~class331.field4741.field8011) {
                  int var11 = -class137.field1781 + var7;
                  int var12 = var6 - class751.field11118;
                  if (var11 > class331.field4741.field8041 || ~var11 > ~(-class331.field4741.field8041) || ~var12 < ~class331.field4741.field8041 || ~var12 > ~(-class331.field4741.field8041)) {
                     class213.field2708 = true;
                  }
               }

               if (class331.field4741.field7964 != null && class213.field2708) {
                  class662 var13 = new class662();
                  var13.field9591 = var9;
                  var13.field9595 = class331.field4741.field7964;
                  var13.field9589 = class331.field4741;
                  var13.field9594 = var8;
                  class265.method2019(var13);
               }
            }
         } else {
            if (~class204.field2630 < -2) {
               class331.field4741 = null;
            }

         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field10864[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(IIIBII)Z"
   )
   public static final boolean method5322(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         if (arg3 != -61) {
            return false;
         } else {
            ++field10861;
            int var7 = arg5;
            int var10000;
            if (var6 != 0) {
               var10000 = arg4;
            } else if (~arg5 < ~arg1) {
               var10000 = 0;
               if (var6 == 0) {
                  return false;
               }
            } else {
               var10000 = arg4;
            }

            while(true) {
               int var8 = var10000;
               if (var6 != 0) {
                  if (~class726.field10789[var7][var8] == ~arg0 && ~class364.field5461[var7][var8] >= -2) {
                     return true;
                  }

                  ++var8;
               }

               while(true) {
                  while(var8 <= arg2) {
                     if (~class726.field10789[var7][var8] == ~arg0 && ~class364.field5461[var7][var8] >= -2) {
                        return true;
                     }

                     ++var8;
                  }

                  if (var6 == 0) {
                     ++var7;
                     if (~var7 < ~arg1) {
                        var10000 = 0;
                        if (var6 == 0) {
                           return false;
                        }
                     } else {
                        var10000 = arg4;
                     }
                     break;
                  }

                  ++var8;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10864[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5323(int arg0) {
      try {
         field10855 = null;
         field10857 = null;
         if (arg0 == -386) {
            field10859 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10864[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(IIIIIILvh;IILwm;II)V"
   )
   public static final void method5324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class378 arg6, int arg7, int arg8, class590 arg9, int arg10, int arg11) {
      try {
         class477.field7094 = arg4;
         class115.field1382 = arg10;
         class272.field3788 = arg7;
         ++field10860;
         class154.field1942 = null;
         class763.field11218 = arg8;
         class16.field189 = null;
         class416.field6366 = arg3;
         class633.field9215 = arg2;
         class486.field7189 = arg6;
         class663.field9605 = arg9;
         class409.field6235 = null;
         class139.field1792 = arg0;
         class289.field4051 = arg5;
         class70.field877 = arg11;
         class697.method5057(-32151);
         if (arg1 <= 18) {
            field10857 = null;
         }

         class165.field2075 = true;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10864[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10864[0] : field10864[2]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field10864[0] : field10864[2]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(IC)I"
   )
   public static final int method5325(int arg0, char arg1) {
      try {
         int var2 = 55 % ((arg0 - -2) / 46);
         ++field10856;
         return ~arg1 <= -1 && ~class741.field11001.length < ~arg1 ? class741.field11001[arg1] : -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10864[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
