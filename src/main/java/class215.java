import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class215 {
   @OriginalMember(
      owner = "client!afa",
      name = "h",
      descriptor = "Llea;"
   )
   private class574 field2730;
   @OriginalMember(
      owner = "client!afa",
      name = "f",
      descriptor = "J"
   )
   public long field2734;
   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2737 = new String[]{method1760(method1759("8>\u001e>&q")), method1760(method1759("yp")), method1760(method1759("ew\u001c\u007f\tg")), method1760(method1759("pdPs\n5f")), method1760(method1759("yd\u001c\u007f\tdhOv\u0003ahA")), method1760(method1759("8>\u001e>$q")), method1760(method1759("yd\u001c\u007f\td>\u0019v\u0003ihA")), method1760(method1759("yd\u001c\u007f\td>\u0019v\u0003?>A")), method1760(method1759("8>\u001e>!q")), method1760(method1759("7-\u0013|")), method1760(method1759("\"vQ>\u0018")), method1760(method1759("8>\u001e>'q")), method1760(method1759("8>\u001e>\u000306\u001e|\f#=W")), method1760(method1759("8>\u001e>Y06\u0016d[q"))};
   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "I"
   )
   public static int field2729;
   @OriginalMember(
      owner = "client!afa",
      name = "c",
      descriptor = "I"
   )
   public static int field2732;
   @OriginalMember(
      owner = "client!afa",
      name = "d",
      descriptor = "I"
   )
   public static int field2733;
   @OriginalMember(
      owner = "client!afa",
      name = "g",
      descriptor = "I"
   )
   public static int field2736;
   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "Lvha;"
   )
   public static class24 field2735;
   @OriginalMember(
      owner = "client!afa",
      name = "e",
      descriptor = "Lgha;"
   )
   public static class690 field2731;

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method1755(int arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field2733;
         String var3 = Integer.toString(arg0);
         int var4 = var3.length() - 3;
         if (var2) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
            var4 -= 3;
         }

         while(true) {
            while(~var4 < -1) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }

            if (!var2) {
               if (var3.length() > arg1) {
                  return field2737[4] + var3.substring(0, var3.length() + -8) + class606.field8936.method4490(class782.field11389, -16777216) + field2737[1] + var3 + field2737[3];
               }

               if (var3.length() > 6) {
                  return field2737[7] + var3.substring(0, var3.length() - 4) + class606.field8938.method4490(class782.field11389, arg1 + -16777225) + field2737[1] + var3 + field2737[3];
               }

               return field2737[6] + var3 + field2737[2];
            }

            var3 = var3;
            var4 -= 3;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2737[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(Lqh;I)V"
   )
   public static final void method1756(class81 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(IZII)I"
   )
   public static final int method1757(int arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field2729;
         if (class659.field9815 == null) {
            return 0;
         } else {
            int var4 = arg0 >> 9;
            if (arg1) {
               field2731 = null;
            }

            int var5 = arg3 >> 9;
            if (~var4 <= -1 && var5 >= 0 && ~var4 >= ~(class273.field3491 + -1) && ~(class211.field2689 - 1) <= ~var5) {
               int var6 = arg2;
               if (~arg2 > -4 && ~(class245.field3092[1][var4][var5] & 2) != -1) {
                  var6 = arg2 + 1;
               }

               return class659.field9815[var6].method3288(arg0, (byte)121, arg3);
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2737[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(Llea;J[Lld;)V"
   )
   public class215(class574 arg0, long arg1, class128[] arg2) {
      try {
         this.field2730 = arg0;
         this.field2734 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2737[13] + (arg0 != null ? field2737[10] : field2737[9]) + ',' + arg1 + ',' + (arg2 != null ? field2737[10] : field2737[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field2732;
         this.field2730.method4309(-122, this.field2734);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2737[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1758(int arg0) {
      try {
         field2731 = null;
         if (arg0 != 0) {
            method1755(-101, -87);
         }

         field2735 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2737[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1759(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1760(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
