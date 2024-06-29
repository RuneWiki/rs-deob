import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class144 {
   @OriginalMember(
      owner = "client!mc",
      name = "j",
      descriptor = "Lum;"
   )
   private class550 field1818;
   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1824 = new String[]{method1202(method1201("YZ0s")), method1202(method1201("ZLrZK")), method1202(method1201("L\u0001r1\u001e")), method1202(method1201("ZLrXK")), method1202(method1201("ZLr[K")), method1202(method1201("\u001b\u000f")), method1202(method1201("ZLr\\K")), method1202(method1201("\u0017h\u0011K")), method1202(method1201("ZLrYK")), method1202(method1201("ZLr]K")), method1202(method1201("ZLr^K")), method1202(method1201("ZLr#\nYF(!K"))};
   @OriginalMember(
      owner = "client!mc",
      name = "i",
      descriptor = "Lsda;"
   )
   public static class269 field1820 = new class269(14, 3);
   @OriginalMember(
      owner = "client!mc",
      name = "d",
      descriptor = "I"
   )
   public static int field1823 = 0;
   @OriginalMember(
      owner = "client!mc",
      name = "g",
      descriptor = "I"
   )
   public static int field1814;
   @OriginalMember(
      owner = "client!mc",
      name = "f",
      descriptor = "I"
   )
   public static int field1815;
   @OriginalMember(
      owner = "client!mc",
      name = "h",
      descriptor = "I"
   )
   public static int field1816;
   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "I"
   )
   public static int field1819;
   @OriginalMember(
      owner = "client!mc",
      name = "c",
      descriptor = "I"
   )
   public static int field1821;
   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "I"
   )
   public static int field1822;
   @OriginalMember(
      owner = "client!mc",
      name = "e",
      descriptor = "Lwb;"
   )
   private class347 field1817;

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(I)Lwb;"
   )
   public final class347 method1194(int arg0) {
      try {
         ++field1816;
         class347 var2 = this.field1818.field8129.field5278;
         if (this.field1818.field8129 == var2) {
            this.field1817 = null;
            return null;
         } else {
            if (arg0 <= 54) {
               field1823 = -108;
            }

            this.field1817 = var2.field5278;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1824[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(Lum;B)V"
   )
   public final void method1195(class550 arg0, byte arg1) {
      try {
         this.field1818 = arg0;
         if (arg1 < 25) {
            field1820 = null;
         }

         ++field1822;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1824[1] + (arg0 != null ? field1824[2] : field1824[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(JB)Ljava/lang/String;"
   )
   public static final String method1196(long arg0, byte arg1) {
      try {
         ++field1819;
         class677.field10187.setTime(new Date(arg0));
         int var3 = class677.field10187.get(7);
         if (arg1 != 13) {
            field1820 = null;
         }

         int var4 = class677.field10187.get(5);
         int var5 = class677.field10187.get(2);
         int var6 = class677.field10187.get(1);
         int var7 = class677.field10187.get(11);
         int var8 = class677.field10187.get(12);
         int var9 = class677.field10187.get(13);
         return class438.field6680[var3 + -1] + field1824[5] + var4 / 10 + var4 % 10 + "-" + class389.field5947[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field1824[7];
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1824[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method1197(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 > -3) {
            field1820 = null;
         }

         ++field1821;
         return class597.method4372(arg1, arg0, (byte)-44) | ~(arg0 & 458752) != -1 || class368.method2860(arg1, arg0, 20428);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1824[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "(B)Lwb;"
   )
   public final class347 method1198(byte arg0) {
      try {
         ++field1814;
         if (arg0 < 83) {
            this.field1818 = null;
         }

         class347 var2 = this.field1817;
         if (this.field1818.field8129 == var2) {
            this.field1817 = null;
            return null;
         } else {
            this.field1817 = var2.field5278;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1824[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1199(byte arg0) {
      try {
         field1820 = null;
         if (arg0 != -48) {
            method1196(-23L, (byte)45);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1824[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "()V"
   )
   public class144() {
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method1200(long arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (class353.field5360 != null) {
            label85: {
               if (class675.field10142 == 1 || ~class675.field10142 == -6) {
                  class303.method2305(arg0, arg1 ^ 6321);
                  if (var3 == 0) {
                     break label85;
                  }
               }

               if (class675.field10142 == 4) {
                  class757.method5497(arg1 + 26285, arg0);
               }
            }
         }

         ++field1815;
         class296.method2250(-22406, (long)class314.field4488, class786.field11439);
         if (class198.field2452 != -1) {
            class169.method1362(class198.field2452, (byte)84);
         }

         int var4 = 0;
         if (var3 != 0) {
            if (class275.field3835[var4]) {
               class446.field6781[var4] = true;
            }

            class482.field7157[var4] = class275.field3835[var4];
            class275.field3835[var4] = false;
            ++var4;
         }

         while(true) {
            int var10000;
            if (~var4 <= ~class117.field1428) {
               class255.field3401 = class314.field4488;
               var10000 = arg1;
               if (var3 == 0) {
                  if (arg1 != 10) {
                     method1200(16L, -60);
                  }

                  class466.method3484((class544)null, -1, (byte)-120, -1);
                  class634.method4567(-125, -1, (class544)null, -1);
                  if (class198.field2452 != -1) {
                     class117.field1428 = 0;
                     class718.method5191(-24812);
                  }

                  class786.field11439.method607();
                  class87.method803((byte)-20, class786.field11439);
                  int var5 = class235.method1761((byte)-51);
                  if (var5 == -1) {
                     var5 = class444.field6754;
                  }

                  if (~var5 == 0) {
                     var5 = class20.field222;
                  }

                  class58.method488(var5, (byte)-109);
                  int var6 = class693.field10418.method3046(-30) << 8;
                  class539.method3998(-83, class693.field10418.field9010, class693.field10418.field9007 + var6, class693.field10418.field9003 + var6, class65.field800);
                  class65.field800 = 0;
                  return;
               }
            } else {
               var10000 = class275.field3835[var4];
            }

            if (var10000 != 0) {
               class446.field6781[var4] = true;
            }

            class482.field7157[var4] = class275.field3835[var4];
            class275.field3835[var4] = false;
            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1824[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "(Lum;)V"
   )
   public class144(class550 arg0) {
      try {
         this.field1818 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1824[11] + (arg0 != null ? field1824[2] : field1824[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1201(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1202(char[] arg0) {
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
            var10005 = 47;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
