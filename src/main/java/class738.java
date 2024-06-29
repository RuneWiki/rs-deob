import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class738 {
   @OriginalMember(
      owner = "client!jka",
      name = "f",
      descriptor = "I"
   )
   public int field10807 = -1;
   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10817 = new String[]{method5365(method5364("CC{0")), method5365(method5364("G]vr^\u0005")), method5365(method5364("V\u00189rd")), method5365(method5364("G]vrX\u0005")), method5365(method5364("G]vr[\u0005")), method5365(method5364("G]vr\\\u0005")), method5365(method5364("G]vr_\u0005")), method5365(method5364("G]vrZ\u0005")), method5365(method5364("G]vr]\u0005"))};
   @OriginalMember(
      owner = "client!jka",
      name = "m",
      descriptor = "Lbu;"
   )
   public static class596 field10809 = new class596();
   @OriginalMember(
      owner = "client!jka",
      name = "e",
      descriptor = "Lfea;"
   )
   public static class681 field10814 = new class681(12, 0, 1, 0);
   @OriginalMember(
      owner = "client!jka",
      name = "c",
      descriptor = "[Z"
   )
   public static boolean[] field10815 = new boolean[8];
   @OriginalMember(
      owner = "client!jka",
      name = "o",
      descriptor = "I"
   )
   public static int field10802;
   @OriginalMember(
      owner = "client!jka",
      name = "g",
      descriptor = "I"
   )
   public static int field10803;
   @OriginalMember(
      owner = "client!jka",
      name = "k",
      descriptor = "I"
   )
   public static int field10804;
   @OriginalMember(
      owner = "client!jka",
      name = "n",
      descriptor = "I"
   )
   public static int field10805;
   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "I"
   )
   public static int field10813;
   @OriginalMember(
      owner = "client!jka",
      name = "i",
      descriptor = "I"
   )
   public static int field10816;
   @OriginalMember(
      owner = "client!jka",
      name = "d",
      descriptor = "Llha;"
   )
   public class36 field10808;
   @OriginalMember(
      owner = "client!jka",
      name = "h",
      descriptor = "[I"
   )
   public int[] field10811;
   @OriginalMember(
      owner = "client!jka",
      name = "j",
      descriptor = "[J"
   )
   public long[] field10810;
   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "[Lmn;"
   )
   public static class238[] field10812;
   @OriginalMember(
      owner = "client!jka",
      name = "l",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field10806;

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5357(int arg0, int arg1, int arg2) {
      try {
         ++field10805;
         if (arg2 != -20749) {
            return true;
         } else if (arg1 >= 0 && ~arg0 <= -1 && class245.field3092[1].length > arg1 && class245.field3092[1][arg1].length > arg0) {
            return ~(class245.field3092[1][arg1][arg0] & 2) != -1;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10817[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5358(int arg0) {
      try {
         ++field10804;
         class137.field1745 = null;
         if (class28.field416 && ~class137.method1146((byte)74) != -2) {
            class734.method5305(arg0 + -1595235045, class157.field2022 == 3 || class157.field2022 == 7, 0, class431.method3331((byte)63), class583.method4355(100), 0);
         }

         int var1 = 0;
         int var2 = 0;
         if (class28.field416) {
            var1 = class356.method2825(0);
            var2 = class465.method3538(-26506);
         }

         class115.method1025(var1, class204.field2605 + var1, class91.field1242 + var2, var2, (byte)-49, class661.field9817, -1, var1, var2);
         if (arg0 != -26067) {
            field10814 = null;
         }

         if (class137.field1745 != null) {
            class427.method3308(class137.field1745, class509.field7102.field9497, true, -1412584499, class450.field6105, class204.field2605 + var1, var1, arg0 + 20837, class318.field4384, class91.field1242 + var2, var2);
            class137.field1745 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10817[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public static final void method5359(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg0 == 4096) {
            ++field10803;
            if (class705.field10295.method1818(-1, (long)arg3) == null) {
               if (!class743.field10863) {
                  class657.method4823(arg3, (byte)-93, arg2);
               } else {
                  class191 var4 = new class191(arg3, new class524(4096, class47.field599, arg3), arg1, arg2);
                  var4.field2423.method2775(class271.field3473[class782.field11389], true);
                  class705.field10295.method1808((long)arg3, var4, 26459);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10817[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method5360(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 31896) {
            return false;
         } else {
            ++field10816;
            return (55 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10817[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "([BII)[B"
   )
   public static final byte[] method5361(byte[] arg0, int arg1, int arg2) {
      try {
         ++field10802;
         if (arg1 != 7203) {
            return null;
         } else {
            byte[] var3 = new byte[arg2];
            class349.method2762(arg0, 0, var3, 0, arg2);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10817[1] + (arg0 != null ? field10817[2] : field10817[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(ICI)C"
   )
   public static final char method5362(int arg0, char arg1, int arg2) {
      try {
         int var3 = 87 / ((arg0 - 63) / 37);
         ++field10813;
         if (~arg1 <= -193 && ~arg1 >= -256) {
            if (arg1 >= 192 && arg1 <= 198) {
               return 'A';
            }

            if (~arg1 == -200) {
               return 'C';
            }

            if (~arg1 <= -201 && ~arg1 >= -204) {
               return 'E';
            }

            if (~arg1 <= -205 && arg1 <= 207) {
               return 'I';
            }

            if (arg1 >= 210 && arg1 <= 214) {
               return 'O';
            }

            if (arg1 >= 217 && ~arg1 >= -221) {
               return 'U';
            }

            if (~arg1 == -222) {
               return 'Y';
            }

            if (arg1 == 223) {
               return 's';
            }

            if (arg1 >= 224 && arg1 <= 230) {
               return 'a';
            }

            if (arg1 == 231) {
               return 'c';
            }

            if (~arg1 <= -233 && arg1 <= 235) {
               return 'e';
            }

            if (arg1 >= 236 && arg1 <= 239) {
               return 'i';
            }

            if (~arg1 <= -243 && ~arg1 >= -247) {
               return 'o';
            }

            if (arg1 >= 249 && ~arg1 >= -253) {
               return 'u';
            }

            if (arg1 == 253 || arg1 == 255) {
               return 'y';
            }
         }

         if (~arg1 == -339) {
            return 'O';
         } else if (~arg1 == -340) {
            return 'o';
         } else if (~arg1 == -377) {
            return 'Y';
         } else {
            return arg1;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10817[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5363(byte arg0) {
      try {
         if (arg0 != 118) {
            method5359(56, -38, true, -72);
         }

         field10814 = null;
         field10809 = null;
         field10815 = null;
         field10812 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10817[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5364(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5365(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
