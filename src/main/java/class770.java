import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class770 extends class297 {
   @OriginalMember(
      owner = "client!hea",
      name = "v",
      descriptor = "[B"
   )
   public byte[] field11340;
   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11342 = new String[]{method5621(method5620("?9\u001c4W>2\u0014nU\u007f")), method5621(method5620("9)\u0011v")), method5621(method5620(",rS4\u0016")), method5621(method5620("?9\u001c4*\u007f"))};
   @OriginalMember(
      owner = "client!hea",
      name = "u",
      descriptor = "I"
   )
   public static int field11341;

   @OriginalMember(
      owner = "client!hea",
      name = "<init>",
      descriptor = "([B)V",
      line = 4
   )
   public class770(byte[] arg0) {
      try {
         this.field11340 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11342[0] + (arg0 != null ? field11342[2] : field11342[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "c",
      descriptor = "(I)V",
      line = 17
   )
   public static final void method5619(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field11341;
         client var2 = class798.field11616;
         synchronized(class798.field11616) {
            if (class751.field11144 == null) {
               Container var3;
               label95: {
                  if (class479.field7289 != null) {
                     var3 = class479.field7289;
                     if (!var1) {
                        break label95;
                     }
                  }

                  if (class684.field10176 != null) {
                     var3 = class684.field10176;
                     if (!var1) {
                        break label95;
                     }
                  }

                  var3 = class92.field1327;
               }

               class155.field2322 = var3.getSize().width;
               class145.field2067 = var3.getSize().height;
               if (class479.field7289 == var3) {
                  Insets var4 = class479.field7289.getInsets();
                  class155.field2322 -= var4.right + var4.left;
                  class145.field2067 -= var4.top + var4.bottom;
               }

               label77: {
                  if (~class187.method1682((byte)-30) == -2) {
                     class519.field7895 = 0;
                     class316.field4878 = class154.field2293;
                     class16.field213 = (-class154.field2293 + class155.field2322) / 2;
                     class692.field10301 = class445.field6835;
                     if (!var1) {
                        break label77;
                     }
                  }

                  class376.method3082(-124);
               }

               if (class657.field9823 != class129.field1852) {
                  boolean var10000;
                  if (~class316.field4878 > -1025 && class692.field10301 < 768) {
                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               }

               if (arg0 > -102) {
                  method5619(21);
               }

               class544.field8183.setSize(class316.field4878, class692.field10301);
               if (class351.field5356 != null) {
                  label63: {
                     if (class281.field4472) {
                        class404.method3250(class544.field8183, -2);
                        if (!var1) {
                           break label63;
                        }
                     }

                     class351.field5356.method647(class544.field8183, class316.field4878, class692.field10301);
                  }
               }

               label58: {
                  if (class479.field7289 == var3) {
                     Insets var5 = class479.field7289.getInsets();
                     class544.field8183.setLocation(var5.left - -class16.field213, var5.top - -class519.field7895);
                     if (!var1) {
                        break label58;
                     }
                  }

                  class544.field8183.setLocation(class16.field213, class519.field7895);
               }

               if (class288.field4539 != -1) {
                  class714.method5291(true, true);
               }

               class651.method4724(-1);
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field11342[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5620(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5621(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
