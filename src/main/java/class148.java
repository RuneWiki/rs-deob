import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class148 {
   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1857 = new String[]{method1223(method1222("Lg*1b")), method1223(method1222("Lg*7b")), method1223(method1222("\u0005c")), method1223(method1222("\u0005e9")), method1223(method1222("\u0006f")), method1223(method1222("\u0005h9")), method1223(method1222("Q'*[7")), method1223(method1222("\u0005y9")), method1223(method1222("Lg*6b")), method1223(method1222("uza\u0019,")), method1223(method1222("\u0006h6")), method1223(method1222("B}p\u0005p\u0005&")), method1223(method1222("D|h\u0019"))};
   @OriginalMember(
      owner = "client!fn",
      name = "d",
      descriptor = "D"
   )
   public static double field1852;
   @OriginalMember(
      owner = "client!fn",
      name = "c",
      descriptor = "I"
   )
   public static int field1851;
   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "I"
   )
   public static int field1853;
   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "I"
   )
   public static int field1854;
   @OriginalMember(
      owner = "client!fn",
      name = "e",
      descriptor = "I"
   )
   public static int field1855;
   @OriginalMember(
      owner = "client!fn",
      name = "f",
      descriptor = "I"
   )
   public static int field1856;

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1218(int arg0) {
      int var1 = client.field4530;

      try {
         int var2 = 0;
         if (var1 != 0) {
            class258.field3498[var2] = false;
            ++var2;
         }

         while(true) {
            while(var2 < 5) {
               class258.field3498[var2] = false;
               ++var2;
            }

            ++field1853;
            class703.field10542 = class733.field10871;
            class366.field5507 = class731.field10844;
            class580.field8589 = 0;
            class741.field10999 = class713.field10637;
            class164.field2064 = -1;
            if (var1 == 0) {
               if (arg0 > -50) {
                  method1221(88, (String)null, -126);
               }

               class778.field11360 = class232.field2947;
               class675.field10142 = 5;
               class108.field1315 = -1;
               class387.field5919 = -1;
               class57.field717 = -1;
               class767.field11253 = class292.field4078;
               class428.field6544 = class314.field4488;
               class547.field8114 = 0;
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1857[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method1219(int arg0, int arg1, int arg2) {
      try {
         label22: {
            ++field1851;
            arg1 = (arg0 & 127) * arg1 >> 7;
            if (~arg1 <= -3) {
               if (arg1 <= 126) {
                  break label22;
               }

               arg1 = 126;
               if (client.field4530 == 0) {
                  break label22;
               }
            }

            arg1 = 2;
         }

         if (arg2 != -18413) {
            field1855 = -3;
         }

         return (65408 & arg0) + arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1857[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1220(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      if (var3 != null) {
         class29.method205(var3.field907);
         class29.method205(var3.field915);
         if (var3.field907 != null) {
            var3.field907 = null;
         }

         if (var3.field915 != null) {
            var3.field915 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(ILjava/lang/String;I)Z"
   )
   public static final boolean method1221(int arg0, String arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field1854;
         if (arg2 != 19065) {
            return true;
         } else if (class755.field11144.field10710) {
            class351.field5344 = new class693();
            class351.field5344.field10414 = arg0;
            class351.field5344.field10410 = arg1;
            if (class487.field7208 != class281.field3917) {
               class351.field5344.field10409 = class351.field5344.field10414 + 40000;
               class351.field5344.field10407 = class351.field5344.field10414 + 50000;
            }

            int var4 = 0;
            if (var3 != 0) {
               if (class433.field6609[var4].field227 == arg0) {
                  class120.field1461 = class433.field6609[var4].field11149;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (~class433.field6609.length >= ~var4) {
                  var10000 = 1;
                  if (var3 == 0) {
                     return true;
                  }
               } else {
                  var10000 = class433.field6609[var4].field227;
               }

               if (var10000 == arg0) {
                  class120.field1461 = class433.field6609[var4].field11149;
               }

               ++var4;
            }
         } else {
            String var5 = "";
            if (class487.field7208 != class281.field3917) {
               var5 = ":" + (arg0 + 7000);
            }

            String var6 = "";
            if (class37.field401 != null) {
               var6 = field1857[7] + class37.field401;
            }

            String var7 = field1857[11] + arg1 + var5 + field1857[3] + class728.field10827 + field1857[5] + class225.field2894 + var6 + field1857[2] + (!client.field4512 ? "0" : "1") + field1857[4] + (!class238.field3004 ? "0" : "1") + field1857[10];

            try {
               class158.field2008.getAppletContext().showDocument(new URL(var7), field1857[9]);
               return true;
            } catch (Exception var9) {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field1857[8] + arg0 + ',' + (arg1 != null ? field1857[6] : field1857[12]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1222(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1223(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
