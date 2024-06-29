import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class209 extends class213 {
   @OriginalMember(
      owner = "client!vb",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2983 = new String[]{method1655(method1654("jR7p")), method1655(method1654("rEu_4")), method1655(method1654("\u007f\tu2a")), method1655(method1654("rEuX4")), method1655(method1654("Ah\u001d")), method1655(method1654("rEu^4")), method1655(method1654("rEu]4"))};
   @OriginalMember(
      owner = "client!vb",
      name = "w",
      descriptor = "Lbl;"
   )
   public static class678 field2976 = null;
   @OriginalMember(
      owner = "client!vb",
      name = "y",
      descriptor = "I"
   )
   public static int field2975 = 0;
   @OriginalMember(
      owner = "client!vb",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2981 = null;
   @OriginalMember(
      owner = "client!vb",
      name = "B",
      descriptor = "I"
   )
   public static int field2974;
   @OriginalMember(
      owner = "client!vb",
      name = "t",
      descriptor = "I"
   )
   public static int field2977;
   @OriginalMember(
      owner = "client!vb",
      name = "A",
      descriptor = "I"
   )
   public static int field2978;
   @OriginalMember(
      owner = "client!vb",
      name = "x",
      descriptor = "I"
   )
   private int field2979;
   @OriginalMember(
      owner = "client!vb",
      name = "u",
      descriptor = "I"
   )
   public static int field2980;
   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private String field2982;

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(Lqv;Z)V"
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method1343((class472)null, true);
         }

         arg0.method3424(this.field2982, (byte)114, this.field2979);
         ++field2980;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2983[6] + (arg0 != null ? field2983[2] : field2983[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1652(boolean arg0) {
      boolean var1 = client.field4360;

      try {
         ++field2974;
         class679 var2 = null;

         try {
            class296 var3 = class316.field4304.method4508((byte)116, "2", true);
            if (var1) {
               class661.method4825(0, 1L);
            }

            while(true) {
               int var10000;
               if (var3.field4078 != 0) {
                  var10000 = var3.field4078;
                  if (!var1) {
                     if (var10000 == 1) {
                        var2 = (class679)var3.field4077;
                        byte[] var4 = new byte[(int)var2.method4954(48)];
                        int var5 = 0;
                        if (var1 || var4.length > var5) {
                           do {
                              int var6 = var2.method4956(var4, var5, var4.length - var5, (byte)-104);
                              if (var6 == -1) {
                                 throw new IOException(field2983[4]);
                              }

                              var5 += var6;
                           } while(var4.length > var5);
                        }

                        class139.method1103(new class147(var4), -2);
                     }
                     break;
                  }
               } else {
                  var10000 = 0;
               }

               class661.method4825(var10000, 1L);
            }
         } catch (Exception var9) {
         }

         try {
            if (var2 != null) {
               var2.method4960(true);
            }
         } catch (Exception var8) {
         }

         if (arg0) {
            field2977 = 10;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2983[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         this.field2979 = arg0.method1164(19693);
         ++field2978;
         if (arg1 < -38) {
            this.field2982 = arg0.method1204(2119550368);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2983[1] + (arg0 != null ? field2983[2] : field2983[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1653(byte arg0) {
      try {
         field2976 = null;
         if (arg0 != -37) {
            method1652(true);
         }

         field2981 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2983[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1654(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1655(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
