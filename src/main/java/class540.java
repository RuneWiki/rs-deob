import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class540 {
   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "I"
   )
   public int field8136 = 0;
   @OriginalMember(
      owner = "client!uga",
      name = "i",
      descriptor = "I"
   )
   public int field8141 = 0;
   @OriginalMember(
      owner = "client!uga",
      name = "c",
      descriptor = "Llj;"
   )
   private class304 field8142 = new class304(64);
   @OriginalMember(
      owner = "client!uga",
      name = "j",
      descriptor = "Lef;"
   )
   private class644 field8146 = null;
   @OriginalMember(
      owner = "client!uga",
      name = "l",
      descriptor = "Lrr;"
   )
   private class678 field8138;
   @OriginalMember(
      owner = "client!uga",
      name = "h",
      descriptor = "Lrr;"
   )
   private class678 field8145;
   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8147 = new String[]{method4133(method4132("\u0004'~O")), method4133(method4132("\u0011|<\r6")), method4133(method4132("\u001f5s\r\bB")), method4133(method4132("\u001f5s\rw\u0003<{WuB")), method4133(method4132("\u001f5s\r\nB")), method4133(method4132("\u001f5s\r\u000fB")), method4133(method4132("\u001f5s\r\tB")), method4133(method4132("\u001f5s\r\u000eB"))};
   @OriginalMember(
      owner = "client!uga",
      name = "g",
      descriptor = "I"
   )
   public static int field8135;
   @OriginalMember(
      owner = "client!uga",
      name = "e",
      descriptor = "I"
   )
   public static int field8137;
   @OriginalMember(
      owner = "client!uga",
      name = "b",
      descriptor = "I"
   )
   public static int field8139;
   @OriginalMember(
      owner = "client!uga",
      name = "k",
      descriptor = "I"
   )
   public static int field8140;
   @OriginalMember(
      owner = "client!uga",
      name = "d",
      descriptor = "I"
   )
   public static int field8143;
   @OriginalMember(
      owner = "client!uga",
      name = "f",
      descriptor = "I"
   )
   public static int field8144;

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method4127(int arg0, String arg1) {
      try {
         ++field8140;
         if (arg0 != 0) {
            method4127(-58, (String)null);
         }

         return class320.method2634(arg1, 10, -90, true);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8147[7] + arg0 + ',' + (arg1 != null ? field8147[1] : field8147[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(Ljw;JI[I)Ljava/lang/String;"
   )
   public final String method4128(class779 arg0, long arg1, int arg2, int[] arg3) {
      try {
         if (arg2 != 1) {
            return null;
         } else {
            ++field8144;
            if (this.field8146 != null) {
               String var6 = this.field8146.method1618(arg1, (byte)125, arg3, arg0);
               if (var6 != null) {
                  return var6;
               }
            }

            return Long.toString(arg1);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8147[2] + (arg0 != null ? field8147[1] : field8147[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8147[1] : field8147[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(IZ)Lvm;"
   )
   public final class367 method4129(int arg0, boolean arg1) {
      try {
         ++field8135;
         if (!arg1) {
            this.field8145 = null;
         }

         class367 var3 = (class367)this.field8142.method2544(false, (long)arg0);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label27: {
               if (arg0 >= 32768) {
                  var4 = this.field8138.method5017(1, 32767 & arg0, (byte)71);
                  if (!client.field1786) {
                     break label27;
                  }
               }

               var4 = this.field8145.method5017(1, arg0, (byte)71);
            }

            class367 var5 = new class367();
            var5.field5708 = this;
            if (var4 != null) {
               var5.method3002(new class354(var4), (byte)-60);
            }

            if (~arg0 <= -32769) {
               var5.method3005(false);
            }

            this.field8142.method2545((long)arg0, 111, var5);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8147[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method4130(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            field8137 = 55;
         }

         ++field8143;
         if (!(~(65536 & arg1) != -1 | class482.method3754(false, arg1, arg2)) && !class372.method3038(128, arg2, arg1)) {
            return (55 & arg2) == 0 && class246.method2092((byte)-40, arg2, arg1);
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8147[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         class619[] var8 = class424.field6543;
         int var9 = 0;
         if (arg3 >= 115) {
            while(var9 < var8.length) {
               class619 var10 = var8[var9];
               if (var10 != null && (var10.field8999 == 2 || var7)) {
                  class697.method5118(arg5 >> 1, var10.field9010, var10.field9008 * 2, 0, var10.field9005, var10.field9001, arg0, arg4, arg2 >> 1);
                  if (class532.field8077[0] > -1 && class308.field4801 % 20 < 10) {
                     class672 var11 = class563.field8367[var10.field9003];
                     int var12 = class532.field8077[0] + arg1 + -12;
                     int var13 = arg6 + -28 - -class532.field8077[1];
                     var11.method4959(var12, var13);
                     class171.method1580(var11.method2106() + var12, var11.method2108() + var13, -94, var13, var12);
                  }
               }

               ++var9;
            }

            ++field8139;
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field8147[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "<init>",
      descriptor = "(ILrr;Lrr;Lef;)V"
   )
   public class540(int arg0, class678 arg1, class678 arg2, class644 arg3) {
      try {
         this.field8138 = arg2;
         this.field8145 = arg1;
         this.field8146 = arg3;
         if (this.field8145 != null) {
            this.field8141 = this.field8145.method4998((byte)-82, 1);
         }

         if (this.field8138 != null) {
            this.field8136 = this.field8138.method4998((byte)-82, 1);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8147[3] + arg0 + ',' + (arg1 != null ? field8147[1] : field8147[0]) + ',' + (arg2 != null ? field8147[1] : field8147[0]) + ',' + (arg3 != null ? field8147[1] : field8147[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4132(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4133(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
