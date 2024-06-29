import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class242 {
   @OriginalMember(
      owner = "client!ue",
      name = "j",
      descriptor = "Lcs;"
   )
   public class357 field3498;
   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3499 = new String[]{method1975(method1974("Nu\u0013<0")), method1975(method1974("Nu\u001390")), method1975(method1974("UeQ\u0013")), method1975(method1974("@>\u0013Qe")), method1975(method1974("Nu\u0013,0")), method1975(method1974("Nu\u001350")), method1975(method1974("Nu\u0013*0")), method1975(method1974("Nu\u0013:0")), method1975(method1974("\u001b=\u0003_")), method1975(method1974("Nu\u0013-0")), method1975(method1974("Nu\u0013+0")), method1975(method1974("Nu\u001340")), method1975(method1974("Nu\u001330")), method1975(method1974("Nu\u0013CqUyIA0"))};
   @OriginalMember(
      owner = "client!ue",
      name = "g",
      descriptor = "I"
   )
   public static int field3486;
   @OriginalMember(
      owner = "client!ue",
      name = "h",
      descriptor = "I"
   )
   public static int field3487;
   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "I"
   )
   public static int field3488;
   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "I"
   )
   public static int field3489;
   @OriginalMember(
      owner = "client!ue",
      name = "l",
      descriptor = "I"
   )
   public static int field3490;
   @OriginalMember(
      owner = "client!ue",
      name = "i",
      descriptor = "I"
   )
   public static int field3491;
   @OriginalMember(
      owner = "client!ue",
      name = "d",
      descriptor = "I"
   )
   public static int field3492;
   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "I"
   )
   public static int field3493;
   @OriginalMember(
      owner = "client!ue",
      name = "e",
      descriptor = "I"
   )
   public static int field3494;
   @OriginalMember(
      owner = "client!ue",
      name = "k",
      descriptor = "I"
   )
   public static int field3495;
   @OriginalMember(
      owner = "client!ue",
      name = "m",
      descriptor = "I"
   )
   public static int field3496;
   @OriginalMember(
      owner = "client!ue",
      name = "f",
      descriptor = "I"
   )
   public static int field3497;

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(BLev;ZZ)V"
   )
   public static final void method1970(byte param0, class719 param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method72(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IILjfa;Z)V"
   )
   public static final void method1971(int arg0, int arg1, class303 arg2, boolean arg3) {
      boolean var4 = client.field4564;

      try {
         if (class85.field1410) {
            class576 var5 = class131.field2175 != -1 ? class559.field8143.method3265(11, class131.field2175) : null;
            if (client.method2454(arg2).method5164(1) && ~(class585.field8461 & 32) != -1 && (var5 == null || ~arg2.method2363(class131.field2175, var5.field8296, 42) != ~var5.field8296)) {
               class388.method3010((long)(arg2.field4265 << 0 | arg2.field4263), arg2.field4346, true, 0L, arg2.field4263, false, -108, false, arg2.field4265, class123.field1965 + field3499[8] + arg2.field4228, 44, class560.field8149, class133.field2194);
               ++class360.field5395;
            }
         }

         ++field3497;
         int var6 = 9;
         String var7;
         if (var4) {
            var7 = class417.method3183(var6, (byte)22, arg2);
            if (var7 != null) {
               ++class295.field4111;
               class388.method3010((long)(arg2.field4263 | arg2.field4265 << 0), arg2.field4346, true, (long)(var6 + 1), arg2.field4263, false, -101, false, arg2.field4265, arg2.field4228, 1003, class37.method455(arg2, -1, var6), var7);
            }

            --var6;
         }

         while(true) {
            String var10000;
            if (var6 < 5) {
               var7 = class696.method5058(arg2, (byte)80);
               var10000 = var7;
               if (!var4) {
                  if (var7 != null) {
                     ++class459.field6729;
                     class388.method3010((long)(arg2.field4265 << 0 | arg2.field4263), arg2.field4346, true, 0L, arg2.field4263, false, -121, false, arg2.field4265, arg2.field4228, 50, arg2.field4328, var7);
                  }

                  if (!arg3) {
                     return;
                  }

                  int var8 = 4;
                  String var9;
                  if (var4) {
                     var9 = class417.method3183(var8, (byte)22, arg2);
                     if (var9 != null) {
                        ++class295.field4111;
                        class388.method3010((long)(arg2.field4263 | arg2.field4265 << 0), arg2.field4346, true, (long)(var8 + 1), arg2.field4263, false, -99, false, arg2.field4265, arg2.field4228, 48, class37.method455(arg2, -1, var8), var9);
                     }

                     --var8;
                  }

                  while(true) {
                     int var12;
                     if (var8 < 0) {
                        var12 = client.method2454(arg2).method5167(-1);
                        if (!var4) {
                           if (var12 != 0) {
                              ++class674.field9881;
                              if (arg2.field4362 == null) {
                                 class388.method3010((long)(arg2.field4263 | arg2.field4265 << 0), arg2.field4346, true, 0L, arg2.field4263, false, -104, false, arg2.field4265, "", 51, -1, class100.field1609.method961(class385.field5684, true));
                                 return;
                              }

                              class388.method3010((long)(arg2.field4263 | arg2.field4265 << 0), arg2.field4346, true, 0L, arg2.field4263, false, -110, false, arg2.field4265, "", 51, -1, arg2.field4362);
                              return;
                           }

                           return;
                        }
                     } else {
                        var12 = var8;
                     }

                     var9 = class417.method3183(var12, (byte)22, arg2);
                     if (var9 != null) {
                        ++class295.field4111;
                        class388.method3010((long)(arg2.field4263 | arg2.field4265 << 0), arg2.field4346, true, (long)(var8 + 1), arg2.field4263, false, -99, false, arg2.field4265, arg2.field4228, 48, class37.method455(arg2, -1, var8), var9);
                     }

                     --var8;
                  }
               }
            } else {
               var7 = class417.method3183(var6, (byte)22, arg2);
               var10000 = var7;
            }

            if (var10000 != null) {
               ++class295.field4111;
               class388.method3010((long)(arg2.field4263 | arg2.field4265 << 0), arg2.field4346, true, (long)(var6 + 1), arg2.field4263, false, -101, false, arg2.field4265, arg2.field4228, 1003, class37.method455(arg2, -1, var6), var7);
            }

            --var6;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3499[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3499[3] : field3499[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IIB)V"
   )
   public abstract void method65(int arg0, int arg1, byte arg2);

   @OriginalMember(
      owner = "client!ue",
      name = "e",
      descriptor = "(I)Z"
   )
   public abstract boolean method69(int arg0);

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(B)V"
   )
   public void method1596(byte arg0) {
      try {
         int var2 = -104 % ((arg0 - -39) / 62);
         ++field3490;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3499[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "d",
      descriptor = "(I)V"
   )
   public void method66(int arg0) {
      try {
         if (arg0 == 29015) {
            ++field3489;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3499[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(I)V"
   )
   public void method74(int arg0) {
      try {
         ++field3493;
         if (arg0 != -1) {
            this.method68(31);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3499[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IILbt;)V"
   )
   public abstract void method73(int arg0, int arg1, class47 arg2);

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(B)V"
   )
   public void method1599(byte arg0) {
      try {
         if (arg0 > -96) {
            this.method73(34, 88, (class47)null);
         }

         ++field3491;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3499[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public abstract void method70(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IB)Lnba;"
   )
   public static final class313 method1972(int arg0, byte arg1) {
      try {
         ++field3495;
         if (arg1 != -90) {
            return null;
         } else {
            return ~arg0 <= -1 && arg0 < 100 ? class448.field6538[arg0] : null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3499[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "(I)V"
   )
   public void method1598(int arg0) {
      try {
         if (arg0 <= 54) {
            this.field3498 = null;
         }

         ++field3492;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3499[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method1973(byte arg0) {
      try {
         class741.field10672 = "";
         class386.field5693 = "";
         ++field3486;
         if (arg0 > -124) {
            method1973((byte)-106);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3499[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(I)V"
   )
   public void method1597(int arg0) {
      try {
         ++field3488;
         if (arg0 != 25728) {
            this.method69(16);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3499[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method68(int arg0);

   @OriginalMember(
      owner = "client!ue",
      name = "<init>",
      descriptor = "(Lcs;)V"
   )
   public class242(class357 arg0) {
      try {
         this.field3498 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3499[13] + (arg0 != null ? field3499[3] : field3499[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1974(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1975(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
