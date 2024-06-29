import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class173 extends class775 {
   @OriginalMember(
      owner = "client!mw",
      name = "t",
      descriptor = "J"
   )
   private long field2616 = -1L;
   @OriginalMember(
      owner = "client!mw",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field2619 = null;
   @OriginalMember(
      owner = "client!mw",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2622 = new String[]{method1595(method1594("\u0003IH\t")), method1595(method1594("\u0000K\n&_")), method1595(method1594("MQA\b\u0015\bNJ\u0004\u001a\b\u0006")), method1595(method1594("\u0000YI\u0007\u0012\u001fTE\u0016\u001fW")), method1595(method1594("\u0016\u0012\nK\n")), method1595(method1594("\u0000K\n _")), method1595(method1594("\u0000K\n!_")), method1595(method1594("\u0000K\n'_")), method1595(method1594("\u0000K\n$_"))};
   @OriginalMember(
      owner = "client!mw",
      name = "w",
      descriptor = "I"
   )
   public static int field2617 = 0;
   @OriginalMember(
      owner = "client!mw",
      name = "v",
      descriptor = "I"
   )
   public static int field2615;
   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "I"
   )
   public static int field2618;
   @OriginalMember(
      owner = "client!mw",
      name = "x",
      descriptor = "I"
   )
   public static int field2620;
   @OriginalMember(
      owner = "client!mw",
      name = "y",
      descriptor = "I"
   )
   public static int field2621;
   @OriginalMember(
      owner = "client!mw",
      name = "A",
      descriptor = "Ljava/awt/datatransfer/Clipboard;"
   )
   public static Clipboard field2614;

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 6
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         ++field2615;
         if (arg0.method2855(-31007) != 255) {
            --arg0.field5436;
            this.field2616 = arg0.method2898(32109);
         }

         this.field2619 = arg0.method2876(55);
         if (class40.field491) {
            System.out.println(field2622[3] + this.field2616 + field2622[2] + this.field2619);
         }

         int var3 = -23 / ((-84 - arg1) / 34);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2622[1] + (arg0 != null ? field2622[4] : field2622[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(ILoo;[[B)V",
      line = 33
   )
   public static final void method1591(int arg0, class508 arg1, byte[][] arg2) {
      boolean var3 = client.field1786;

      try {
         int var4 = 2 / ((arg0 - 40) / 61);
         ++field2621;
         int var5 = arg2.length;
         int var6 = 0;
         if (var3 || ~var6 > ~var5) {
            do {
               byte[] var7 = arg2[var6];
               if (var7 != null) {
                  class354 var8 = new class354(var7);
                  int var9 = class62.field796[var6] >> 8;
                  int var10 = class62.field796[var6] & 255;
                  int var11 = var9 * 64 + -class120.field1694;
                  int var12 = var10 * 64 + -class119.field1606;
                  class532.method4095(-86);
                  arg1.method3228(class119.field1606, class120.field1694, (byte)-128, var8, var11, class221.field3326, var12);
                  arg1.method3951(var12, var11, (byte)121, var8, class351.field5356);
               }

               ++var6;
            } while(~var6 > ~var5);
         }

         int var13 = 0;
         if (var3 || var5 > var13) {
            do {
               int var14 = (class62.field796[var13] >> 8) * 64 + -class120.field1694;
               int var15 = (class62.field796[var13] & 255) * 64 + -class119.field1606;
               byte[] var16 = arg2[var13];
               if (var16 == null && ~class294.field4663 > -801) {
                  class532.method4095(-104);
                  arg1.method3223(true, var15, var14, 64, 64);
               }

               ++var13;
            } while(var5 > var13);

         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field2622[7] + arg0 + ',' + (arg1 != null ? field2622[4] : field2622[0]) + ',' + (arg2 != null ? field2622[4] : field2622[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 95
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         arg0.method1929(0, this.field2619, this.field2616, -1);
         int var3 = -55 / ((-23 - arg1) / 45);
         ++field2620;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2622[8] + (arg0 != null ? field2622[4] : field2622[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "(B)V",
      line = 106
   )
   public static final void method1592(byte arg0) {
      boolean var1 = client.field1786;

      try {
         label28: {
            if (class625.field9068 == null) {
               if (~class727.field10854 != 0) {
                  class629.method4603(true, class444.field6812);
                  if (!var1) {
                     break label28;
                  }
               }

               class240.method2046(class455.field6963, false, class444.field6812, class722.field10813);
               if (!var1) {
                  break label28;
               }
            }

            class232.method1994(35, class444.field6812);
         }

         ++field2618;
         if (arg0 != 38) {
            field2614 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2622[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "(B)V",
      line = 127
   )
   public static void method1593(byte arg0) {
      try {
         if (arg0 == -89) {
            field2614 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2622[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1595(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
