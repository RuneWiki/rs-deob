import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class234 {
   @OriginalMember(
      owner = "client!bu",
      name = "i",
      descriptor = "I"
   )
   public int field3622;
   @OriginalMember(
      owner = "client!bu",
      name = "d",
      descriptor = "I"
   )
   public int field3617;
   @OriginalMember(
      owner = "client!bu",
      name = "e",
      descriptor = "I"
   )
   public int field3616;
   @OriginalMember(
      owner = "client!bu",
      name = "f",
      descriptor = "I"
   )
   public int field3619;
   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3627 = new String[]{method2076(method2075(",\r\u0005m\u0007")), method2076(method2075("5V\u0005\u0002R")), method2076(method2075(" \rG@")), method2076(method2075(",\r\u0005\u0010F \u0011_\u0012\u0007")), method2076(method2075(",\r\u0005o\u0007")), method2076(method2075(",\r\u0005X@\u001d\fYEA)P")), method2076(method2075(",\r\u0005h\u0007")), method2076(method2075("gD\u0004O@\"F")), method2076(method2075("rWHCCp")), method2076(method2075("nDHCCs\u001eMJI~H\u0015")), method2076(method2075("nP")), method2076(method2075("nDHCCs\u001eMJI(\u001e\u0015")), method2076(method2075("nDHCCsH\u001bJIvH\u0015")), method2076(method2075(",\r\u0005n\u0007"))};
   @OriginalMember(
      owner = "client!bu",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field3618 = new int[3];
   @OriginalMember(
      owner = "client!bu",
      name = "j",
      descriptor = "Lsb;"
   )
   public static class261 field3623 = new class261();
   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "I"
   )
   public static int field3626 = 104;
   @OriginalMember(
      owner = "client!bu",
      name = "c",
      descriptor = "I"
   )
   public static int field3620;
   @OriginalMember(
      owner = "client!bu",
      name = "g",
      descriptor = "I"
   )
   public static int field3621;
   @OriginalMember(
      owner = "client!bu",
      name = "h",
      descriptor = "I"
   )
   public static int field3624;
   @OriginalMember(
      owner = "client!bu",
      name = "b",
      descriptor = "I"
   )
   public static int field3625;

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2071(byte arg0) {
      try {
         field3623 = null;
         field3618 = null;
         int var1 = -52 % ((arg0 - 24) / 56);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3627[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3621;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3627[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method2072(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field3625;
         String var3 = Integer.toString(arg0);
         if (arg1 <= 20) {
            method2072(64, -103);
         }

         int var4 = var3.length() - 3;
         if (var2) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
            var4 -= 3;
         }

         while(true) {
            while(var4 > 0) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }

            if (!var2) {
               if (var3.length() > 9) {
                  return field3627[12] + var3.substring(0, -8 + var3.length()) + class765.field10936.method5512(-2, class777.field11340) + field3627[10] + var3 + field3627[7];
               }

               if (~var3.length() < -7) {
                  return field3627[11] + var3.substring(0, var3.length() - 4) + class765.field10938.method5512(-2, class777.field11340) + field3627[10] + var3 + field3627[7];
               }

               return field3627[9] + var3 + field3627[8];
            }

            var3 = var3;
            var4 -= 3;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3627[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z"
   )
   public static final boolean method2073(byte arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         ++field3620;
         if (arg1 == null) {
            return false;
         } else {
            int var3 = 0;
            int var4 = -119 / ((-52 - arg0) / 33);
            if (var2) {
               if (arg1.equalsIgnoreCase(class517.field7314[var3])) {
                  return true;
               }

               if (arg1.equalsIgnoreCase(class162.field2467[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               boolean var10000;
               if (var3 >= class265.field4046) {
                  var10000 = false;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = arg1.equalsIgnoreCase(class517.field7314[var3]);
               }

               if (var10000) {
                  return true;
               }

               if (arg1.equalsIgnoreCase(class162.field2467[var3])) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3627[6] + arg0 + ',' + (arg1 != null ? field3627[1] : field3627[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(ZILsa;JIBI)V"
   )
   public static final void method2074(boolean arg0, int arg1, class39 arg2, long arg3, int arg4, byte arg5, int arg6) {
      try {
         ++field3624;
         class499.method3779(arg4, 19608, arg2, arg3, arg6, arg0, 0, arg1);
         int var8 = 25 % ((-25 - arg5) / 55);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3627[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3627[1] : field3627[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class234(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field3622 = arg3;
         this.field3617 = arg2;
         this.field3616 = arg0;
         this.field3619 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3627[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2075(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2076(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
