import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class335 {
   @OriginalMember(
      owner = "client!ne",
      name = "f",
      descriptor = "I"
   )
   public int field4791;
   @OriginalMember(
      owner = "client!ne",
      name = "g",
      descriptor = "I"
   )
   public int field4789;
   @OriginalMember(
      owner = "client!ne",
      name = "e",
      descriptor = "I"
   )
   public int field4793;
   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4795 = new String[]{method2543(method2542("%*\u007f6\b")), method2543(method2542("0a\u007fP]")), method2543(method2542("%:=\u0012")), method2543(method2542("qo")), method2543(method2542("%*\u007f9\b")), method2543(method2542("%*\u007f8\b")), method2543(method2542("%*\u007fBI%&%@\b"))};
   @OriginalMember(
      owner = "client!ne",
      name = "h",
      descriptor = "Loi;"
   )
   public static class79 field4792 = new class79(6, 1);
   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field4794 = new class101(76, 2);
   @OriginalMember(
      owner = "client!ne",
      name = "c",
      descriptor = "I"
   )
   public static int field4787;
   @OriginalMember(
      owner = "client!ne",
      name = "d",
      descriptor = "I"
   )
   public static int field4788;
   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "I"
   )
   public static int field4790;

   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2536(int arg0) {
      int var1 = client.field4530;

      try {
         int var2 = arg0;
         int var10000;
         if (var1 != 0) {
            var10000 = class115.field1381[arg0];
         } else if (~arg0 <= ~class159.field2021) {
            var10000 = field4790 + 1;
            if (var1 == 0) {
               field4790 = var10000;
               return;
            }
         } else {
            var10000 = class115.field1381[arg0];
         }

         while(true) {
            int var3 = var10000;
            class726 var4 = (class726)class259.field3509.method5681((long)var3, arg0 + -1);
            if (var4 != null) {
               class155 var5 = var4.field10794;
               class707.method5134(-1, var5.field1971.field5589, var5);
            }

            ++var2;
            if (~var2 <= ~class159.field2021) {
               var10000 = field4790 + 1;
               if (var1 == 0) {
                  field4790 = var10000;
                  return;
               }
            } else {
               var10000 = class115.field1381[var2];
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4795[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(IBI)V"
   )
   public abstract void method2537(int arg0, byte arg1, int arg2);

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2538(int arg0) {
      try {
         field4794 = null;
         field4792 = null;
         if (arg0 != 0) {
            method2536(74);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4795[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method2539(byte arg0, String arg1) {
      int var2 = client.field4530;

      try {
         if (class784.field11421 == null) {
            class600.method4388(500);
         }

         ++field4788;
         if (arg0 != -110) {
            field4792 = null;
         }

         class677.field10187.setTime(new Date(class188.method1462(true)));
         int var3 = class677.field10187.get(11);
         int var4 = class677.field10187.get(12);
         int var5 = class677.field10187.get(13);
         String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
         String[] var7 = class136.method1163('\n', arg1, 99);
         int var8 = 0;
         if (var2 != 0 || var7.length > var8) {
            do {
               int var9 = class793.field11555;
               if (var2 != 0) {
                  class784.field11421[var9] = class784.field11421[var9 + -1];
                  --var9;
               }

               while(true) {
                  while(var9 > 0) {
                     class784.field11421[var9] = class784.field11421[var9 + -1];
                     --var9;
                  }

                  class784.field11421[0] = var6 + field4795[3] + var7[var8];
                  if (var2 == 0) {
                     if (class186.field2336 != null) {
                        try {
                           class186.field2336.write(class23.method156(class784.field11421[0] + "\n", (byte)-120));
                        } catch (IOException var11) {
                        }
                     }

                     if (~(class784.field11421.length + -1) < ~class793.field11555) {
                        ++class793.field11555;
                        if (class180.field2220 > 0) {
                           ++class180.field2220;
                        }
                     }

                     ++var8;
                     break;
                  }

                  --var9;
               }
            } while(var7.length > var8);

         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field4795[4] + arg0 + ',' + (arg1 != null ? field4795[1] : field4795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(BII)V"
   )
   public abstract void method2540(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2541(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class335(int arg0, int arg1, int arg2) {
      try {
         this.field4791 = arg1;
         this.field4789 = arg2;
         this.field4793 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4795[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2542(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2543(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
