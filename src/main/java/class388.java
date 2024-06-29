import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class388 {
   @OriginalMember(
      owner = "client!bc",
      name = "b",
      descriptor = "I"
   )
   public int field5625 = 128;
   @OriginalMember(
      owner = "client!bc",
      name = "k",
      descriptor = "I"
   )
   public int field5629 = 128;
   @OriginalMember(
      owner = "client!bc",
      name = "j",
      descriptor = "I"
   )
   public int field5622;
   @OriginalMember(
      owner = "client!bc",
      name = "n",
      descriptor = "I"
   )
   public int field5631;
   @OriginalMember(
      owner = "client!bc",
      name = "i",
      descriptor = "I"
   )
   public int field5627;
   @OriginalMember(
      owner = "client!bc",
      name = "c",
      descriptor = "I"
   )
   public int field5630;
   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5634 = new String[]{method2952(method2951("\u001f1NL2")), method2952(method2951("\u0006|N!g")), method2952(method2951("\u001f1NJ2")), method2952(method2951("\u0013'\fc")), method2952(method2951("\u001f1NK2")), method2952(method2951("\u0011=\u0007h\u007f\u0019=\u0015{")), method2952(method2951("\u001a\"\t>:\r=\u00135")), method2952(method2951("\u001f1NM2")), method2952(method2951("]\"\u0013f`\u0018h")), method2952(method2951("P\u007fMjt\u00195\u0010\u007f7P\u007f")), method2952(method2951("\u001f1NI2")), method2952(method2951("\u001f1N3s\u0013;\u001412")), method2952(method2951("\u001f1NN2"))};
   @OriginalMember(
      owner = "client!bc",
      name = "l",
      descriptor = "Lek;"
   )
   public static class536 field5628 = new class536(36, 7);
   @OriginalMember(
      owner = "client!bc",
      name = "g",
      descriptor = "Laga;"
   )
   public static class696 field5633 = new class696(16);
   @OriginalMember(
      owner = "client!bc",
      name = "f",
      descriptor = "I"
   )
   public static int field5620;
   @OriginalMember(
      owner = "client!bc",
      name = "d",
      descriptor = "I"
   )
   public static int field5621;
   @OriginalMember(
      owner = "client!bc",
      name = "m",
      descriptor = "I"
   )
   public static int field5623;
   @OriginalMember(
      owner = "client!bc",
      name = "h",
      descriptor = "I"
   )
   public static int field5624;
   @OriginalMember(
      owner = "client!bc",
      name = "e",
      descriptor = "I"
   )
   public static int field5626;
   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "J"
   )
   public static long field5632;

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ZB)V",
      line = 11
   )
   public static final void method2945(boolean arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         class10[] var3 = class430.field6154;
         int var4 = 0;
         if (var2 || var4 < var3.length) {
            do {
               class10 var5 = var3[var4];
               var5.method54((byte)80);
               ++var4;
            } while(var4 < var3.length);
         }

         ++field5620;
         class625.method4542(false);
         class84.method750(arg1 + -41);
         class29.method268();
         int var6 = 0;
         if (var2) {
            class767.field11309[var6].method4397(31436);
            ++var6;
         }

         while(true) {
            while(var6 < 4) {
               class767.field11309[var6].method4397(31436);
               ++var6;
            }

            class389.method2954(false, (byte)-112);
            System.gc();
            class584.method4259((byte)-116, 2);
            class497.field7205 = -1;
            class759.field11229 = false;
            class488.method3544(arg1 ^ 18);
            if (!var2) {
               if (arg1 != -20) {
                  method2948((byte)-67);
               }

               class759.method5507(arg1 ^ -105, true);
               class211.method1671((byte)-103);
               class612.method4450(false);
               class780.method5623((byte)45);
               if (arg0) {
                  class731.method5321(13, (byte)-107);
                  return;
               }

               class731.method5321(3, (byte)-89);

               try {
                  class548.method3934(class216.field3093, false, field5634[5]);
                  return;
               } catch (Throwable var8) {
                  return;
               }
            }

            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5634[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "<init>",
      descriptor = "(I)V",
      line = 151
   )
   public class388(int arg0) {
      try {
         this.field5622 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5634[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 158
   )
   private class388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field5631 = arg5;
         this.field5622 = arg0;
         this.field5627 = arg4;
         this.field5625 = arg1;
         this.field5629 = arg2;
         this.field5630 = arg3;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5634[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(Lbc;I)V",
      line = 68
   )
   public final void method2946(class388 arg0, int arg1) {
      try {
         this.field5630 = arg0.field5630;
         this.field5627 = arg0.field5627;
         if (arg1 >= -120) {
            this.method2946((class388)null, -2);
         }

         ++field5626;
         this.field5629 = arg0.field5629;
         this.field5625 = arg0.field5625;
         this.field5622 = arg0.field5622;
         this.field5631 = arg0.field5631;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5634[2] + (arg0 != null ? field5634[1] : field5634[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ILbda;I)V",
      line = 85
   )
   public static final void method2947(int arg0, class534 arg1, int arg2) {
      try {
         ++field5624;
         class753.field11133 = 0;
         class498.field7234 = false;
         class137.method1082((byte)-121, arg1);
         class3.method10(-1, arg1);
         int var3 = -110 % ((-51 - arg2) / 60);
         if (class498.field7234) {
            System.out.println(field5634[9]);
         }

         if (arg1.field1856 != arg0) {
            throw new RuntimeException(field5634[6] + arg1.field1856 + field5634[8] + arg0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5634[7] + arg0 + ',' + (arg1 != null ? field5634[1] : field5634[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(B)V",
      line = 104
   )
   public static void method2948(byte arg0) {
      try {
         if (arg0 != -43) {
            field5628 = null;
         }

         field5628 = null;
         field5633 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5634[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(I)Lbc;",
      line = 117
   )
   public final class388 method2949(int arg0) {
      try {
         ++field5621;
         if (arg0 != 128) {
            method2948((byte)-49);
         }

         return new class388(this.field5622, this.field5625, this.field5629, this.field5630, this.field5627, this.field5631);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5634[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IIIIB)V",
      line = 130
   )
   public static final void method2950(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         class761.field11251 = arg2;
         class17.field195 = arg0;
         if (arg4 <= 41) {
            method2947(19, (class534)null, 50);
         }

         class733.field10730 = arg3;
         ++field5623;
         class369.field5077 = arg1;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5634[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2951(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2952(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
