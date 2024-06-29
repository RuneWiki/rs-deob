import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class737 extends class566 implements class338 {
   @OriginalMember(
      owner = "client!hm",
      name = "ib",
      descriptor = "Z"
   )
   private boolean field10522 = true;
   @OriginalMember(
      owner = "client!hm",
      name = "Z",
      descriptor = "Lpn;"
   )
   public class735 field10503;
   @OriginalMember(
      owner = "client!hm",
      name = "ob",
      descriptor = "Z"
   )
   private boolean field10515;
   @OriginalMember(
      owner = "client!hm",
      name = "qb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10525 = new String[]{method5336(method5335("$w?K=")), method5336(method5335("\"o}p")), method5336(method5335("$w? |\"se\"=")), method5336(method5335("74?2h")), method5336(method5335("$w?XTd")), method5336(method5335("$w?]Td")), method5336(method5335("$w?S=")), method5336(method5335("$w?U=")), method5336(method5335("$w?I=")), method5336(method5335("$w?V=")), method5336(method5335("$w?M=")), method5336(method5335("$w?Q=")), method5336(method5335("$w?P=")), method5336(method5335("$w?ZTd")), method5336(method5335("$w?J=")), method5336(method5335("$w?^Td")), method5336(method5335("$w?H=")), method5336(method5335("$w?R=")), method5336(method5335("$w?N=")), method5336(method5335("$w?O=")), method5336(method5335("$w?W="))};
   @OriginalMember(
      owner = "client!hm",
      name = "cb",
      descriptor = "[I"
   )
   public static int[] field10502 = new int[2];
   @OriginalMember(
      owner = "client!hm",
      name = "kb",
      descriptor = "Z"
   )
   public static boolean field10518 = false;
   @OriginalMember(
      owner = "client!hm",
      name = "T",
      descriptor = "I"
   )
   public static int field10501;
   @OriginalMember(
      owner = "client!hm",
      name = "gb",
      descriptor = "I"
   )
   public static int field10504;
   @OriginalMember(
      owner = "client!hm",
      name = "fb",
      descriptor = "I"
   )
   public static int field10505;
   @OriginalMember(
      owner = "client!hm",
      name = "Y",
      descriptor = "I"
   )
   public static int field10506;
   @OriginalMember(
      owner = "client!hm",
      name = "hb",
      descriptor = "I"
   )
   public static int field10507;
   @OriginalMember(
      owner = "client!hm",
      name = "X",
      descriptor = "I"
   )
   public static int field10508;
   @OriginalMember(
      owner = "client!hm",
      name = "ab",
      descriptor = "I"
   )
   public static int field10509;
   @OriginalMember(
      owner = "client!hm",
      name = "U",
      descriptor = "I"
   )
   public static int field10510;
   @OriginalMember(
      owner = "client!hm",
      name = "S",
      descriptor = "I"
   )
   public static int field10511;
   @OriginalMember(
      owner = "client!hm",
      name = "lb",
      descriptor = "I"
   )
   public static int field10512;
   @OriginalMember(
      owner = "client!hm",
      name = "jb",
      descriptor = "I"
   )
   public static int field10513;
   @OriginalMember(
      owner = "client!hm",
      name = "V",
      descriptor = "I"
   )
   public static int field10514;
   @OriginalMember(
      owner = "client!hm",
      name = "bb",
      descriptor = "I"
   )
   public static int field10517;
   @OriginalMember(
      owner = "client!hm",
      name = "eb",
      descriptor = "I"
   )
   public static int field10519;
   @OriginalMember(
      owner = "client!hm",
      name = "pb",
      descriptor = "I"
   )
   public static int field10520;
   @OriginalMember(
      owner = "client!hm",
      name = "nb",
      descriptor = "I"
   )
   public static int field10521;
   @OriginalMember(
      owner = "client!hm",
      name = "db",
      descriptor = "I"
   )
   public static int field10523;
   @OriginalMember(
      owner = "client!hm",
      name = "W",
      descriptor = "I"
   )
   public static int field10524;
   @OriginalMember(
      owner = "client!hm",
      name = "mb",
      descriptor = "Loga;"
   )
   private class358 field10516;

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public final boolean method718(int arg0, int arg1, int arg2, class17 arg3) {
      try {
         if (arg2 != 0) {
            field10502 = null;
         }

         ++field10510;
         class761 var5 = this.field10503.method5325(false, arg3, false, 131072, 10);
         if (var5 == null) {
            return false;
         } else {
            class502 var6 = arg3.method254();
            var6.method322(super.field6832 - -super.field8045, super.field6829, super.field6833 - -super.field8044);
            return !class791.field11526 ? var5.method748(arg0, arg1, var6, false, 0) : var5.method804(arg0, arg1, var6, false, 0, class582.field8178);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10525[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10525[3] : field10525[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method734(int arg0) {
      try {
         if (arg0 != -5723) {
            this.method5333(-17, (class468)null);
         }

         ++field10517;
         return this.field10503.field10460;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "k",
      descriptor = "(I)Z"
   )
   public final boolean method723(int arg0) {
      try {
         ++field10512;
         if (arg0 >= -26) {
            this.method718(94, 106, 37, (class17)null);
         }

         return this.field10522;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method724(int arg0) {
      try {
         ++field10506;
         return arg0 != 23976 ? 126 : this.field10503.field10464;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method728(int arg0) {
      try {
         ++field10519;
         if (arg0 != 0) {
            field10518 = false;
         }

         return this.field10503.method5320((byte)98);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "n",
      descriptor = "(I)V"
   )
   public static final void method5332(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field10509;
         if (arg0 != 0) {
            field10502 = null;
         }

         class610 var2 = null;

         try {
            class92 var3 = class720.field10318.method877(true, 122, "");
            if (var1) {
               class97.method968(arg0 + 32353, 1L);
            }

            while(true) {
               int var10000;
               short var10001;
               if (~var3.field1526 != -1) {
                  var10000 = var3.field1526;
                  var10001 = 1;
                  if (!var1) {
                     if (var10000 == 1) {
                        var2 = (class610)var3.field1525;
                        class65 var4 = class476.field6870.method4709(-5651);
                        var2.method4491(1, var4.field942, 0, var4.field945);
                     }
                     break;
                  }
               } else {
                  var10000 = arg0;
                  var10001 = 32353;
               }

               class97.method968(var10000 + var10001, 1L);
            }
         } catch (Exception var7) {
         }

         try {
            if (var2 != null) {
               var2.method4494((byte)101);
            }
         } catch (Exception var6) {
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10525[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method720(byte arg0) {
      try {
         ++field10501;
         if (arg0 > -75) {
            field10502 = null;
         }

         return this.field10503.method5313((byte)-117);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(ILcn;)V"
   )
   public final void method5333(int arg0, class468 arg1) {
      try {
         this.field10503.method5322(arg1, arg0 + -17242);
         ++field10513;
         if (arg0 != 22585) {
            field10518 = true;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10525[10] + arg0 + ',' + (arg1 != null ? field10525[3] : field10525[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public final void method736(int arg0, class17 arg1) {
      try {
         if (arg0 != -19501) {
            this.method722(false, (class17)null);
         }

         ++field10504;
         this.field10503.method5317(arg1, arg0 + 19408);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10525[7] + arg0 + ',' + (arg1 != null ? field10525[3] : field10525[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public final void method727(class17 arg0, int arg1) {
      try {
         this.field10503.method5324(true, arg0);
         ++field10511;
         if (arg1 != -26496) {
            this.field10503 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10525[19] + (arg0 != null ? field10525[3] : field10525[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "b",
      descriptor = "(ILha;)Lwba;"
   )
   public final class731 method730(int arg0, class17 arg1) {
      boolean var3 = client.field10022;

      try {
         ++field10521;
         class761 var4 = this.field10503.method5325(false, arg1, true, 2048, 10);
         if (var4 == null) {
            return null;
         } else {
            class502 var5 = arg1.method254();
            var5.method322(super.field6832 - -super.field8045, super.field6829, super.field6833 - -super.field8044);
            class731 var6 = class54.method574(0, this.field10515, 1);
            int var7 = super.field6832 >> 9;
            int var8 = super.field6833 >> 9;
            if (arg0 >= -30) {
               this.field10503 = null;
            }

            label58: {
               this.field10503.method5323(var8, var7, var4, var5, true, -1, arg1, var7, var8);
               if (!class791.field11526) {
                  var4.method805(var5, var6.field10397[0], 0);
                  if (!var3) {
                     break label58;
                  }
               }

               var4.method763(var5, var6.field10397[0], class582.field8178, 0);
            }

            if (this.field10503.field10485 != null) {
               label52: {
                  class521 var9 = this.field10503.field10485.method3980();
                  if (class791.field11526) {
                     arg1.method169(var9, class582.field8178);
                     if (!var3) {
                        break label52;
                     }
                  }

                  arg1.method194(var9);
               }
            }

            this.field10522 = var4.method781() || this.field10503.field10485 != null;
            if (this.field10516 != null) {
               class228.method2026(this.field10516, var4, super.field6829, 78, super.field6832, super.field6833);
               if (!var3) {
                  return var6;
               }
            }

            this.field10516 = class357.method2806(super.field6833, super.field6832, -120, var4, super.field6829);
            return var6;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10525[18] + arg0 + ',' + (arg1 != null ? field10525[3] : field10525[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method733(int arg0) {
      try {
         if (arg0 != 28344) {
            method5332(27);
         }

         ++field10523;
         return this.field10503.field10458;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "m",
      descriptor = "(I)V"
   )
   public static void method5334(int arg0) {
      try {
         if (arg0 == 526699209) {
            field10502 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10525[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public final void method726(class17 arg0, byte arg1) {
      try {
         ++field10520;
         int var3 = -24 / ((39 - arg1) / 46);
         class761 var4 = this.field10503.method5325(false, arg0, true, 262144, 10);
         if (var4 != null) {
            int var5 = super.field6832 >> 9;
            int var6 = super.field6833 >> 9;
            class502 var7 = arg0.method254();
            var7.method322(super.field6832, super.field6829, super.field6833);
            this.field10503.method5323(var6, var5, var4, var7, false, -1, arg0, var5, var6);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10525[12] + (arg0 != null ? field10525[3] : field10525[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(ZLha;)Loga;"
   )
   public final class358 method722(boolean arg0, class17 arg1) {
      try {
         ++field10524;
         if (arg0) {
            this.field10522 = true;
         }

         return this.field10516;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10525[4] + arg0 + ',' + (arg1 != null ? field10525[3] : field10525[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method732(int arg0) {
      try {
         if (arg0 != 9799) {
            this.method722(false, (class17)null);
         }

         ++field10507;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method721(byte arg0) {
      try {
         ++field10508;
         return arg0 < 81 ? false : this.field10503.method5316(true);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "<init>",
      descriptor = "(Lha;Lbha;IIIIIZIIIII)V"
   )
   public class737(class17 arg0, class544 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);

      try {
         this.field10503 = new class735(arg0, arg1, arg10, arg11, super.field6824, arg3, this, arg7, arg12);
         this.field10515 = arg1.field7716 != 0 && !arg7;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field10525[2] + (arg0 != null ? field10525[3] : field10525[1]) + ',' + (arg1 != null ? field10525[3] : field10525[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "h",
      descriptor = "(I)Z"
   )
   public final boolean method725(int arg0) {
      try {
         ++field10505;
         if (arg0 != -6664) {
            this.method724(21);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10525[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5336(char[] arg0) {
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
            var10005 = 26;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
