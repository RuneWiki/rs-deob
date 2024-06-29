import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class149 {
   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2306 = new String[]{method1456(method1455("_^\u001d}JBB\u0015j")), method1456(method1455("T\u0002")), method1456(method1455("\u0004G\u0019h\u0001Rr\u001bn\u0007BH'")), method1456(method1455("XZ")), method1456(method1455("I\u0017W")), method1456(method1455("I\u0017W}\u0017IL\u001bg\u0001\u0005")), method1456(method1455("\u0004K\u0011c\u0001u^\f`\u0016Or")), method1456(method1455("\u0005Y\u0015\u007fK")), method1456(method1455("I\u0017Wx\rDC\f ")), method1456(method1455("I\u0017Wx\rDI\u0017x\u0017\u0005")), method1456(method1455("\u0005_\u000bl\u0005IE\u001d "))};
   @OriginalMember(
      owner = "client!qh",
      name = "d",
      descriptor = "Z"
   )
   private static boolean field2305 = false;
   @OriginalMember(
      owner = "client!qh",
      name = "e",
      descriptor = "Ljava/util/Hashtable;"
   )
   private static Hashtable field2302 = new Hashtable(16);
   @OriginalMember(
      owner = "client!qh",
      name = "b",
      descriptor = "I"
   )
   private static int field2303;
   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   private static String field2301;
   @OriginalMember(
      owner = "client!qh",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private static String field2304;

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/io/File;"
   )
   public static File method1452(byte arg0, String arg1) {
      if (arg0 <= 15) {
         method1454(42, (String)null, 115);
      }

      return method1453(field2304, field2303, arg1, (byte)-112);
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Ljava/io/File;"
   )
   public static File method1453(String arg0, int arg1, String arg2, byte arg3) {
      if (!field2305) {
         throw new RuntimeException("");
      } else {
         File var4 = (File)field2302.get(arg2);
         if (var4 != null) {
            return var4;
         } else {
            String[] var5 = new String[]{field2306[5], field2306[10], field2306[9], field2306[8], field2306[4], field2301, field2306[7], ""};
            String[] var6 = new String[]{field2306[2] + arg1, field2306[6] + arg1};

            for(int var7 = 0; ~var7 > -3; ++var7) {
               for(int var8 = 0; ~var6.length < ~var8; ++var8) {
                  for(int var9 = 0; var5.length > var9; ++var9) {
                     String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
                     RandomAccessFile var11 = null;

                     try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                           String var13 = var5[var9];
                           if (~var7 != -2 || ~var13.length() >= -1 || (new File(var13)).exists()) {
                              (new File(var5[var9] + var6[var8])).mkdir();
                              if (arg0 != null) {
                                 (new File(var5[var9] + var6[var8] + "/" + arg0)).mkdir();
                              }

                              var11 = new RandomAccessFile(var12, field2306[3]);
                              int var14 = var11.read();
                              var11.seek(0L);
                              var11.write(var14);
                              var11.seek(0L);
                              var11.close();
                              field2302.put(arg2, var12);
                              return var12;
                           }
                        }
                     } catch (Exception var17) {
                        try {
                           if (var11 != null) {
                              var11.close();
                              Object var15 = null;
                           }
                        } catch (Exception var16) {
                        }
                     }
                  }
               }
            }

            if (arg3 > -81) {
               field2301 = null;
            }

            throw new RuntimeException();
         }
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   public static void method1454(int arg0, String arg1, int arg2) {
      field2304 = arg1;
      field2303 = arg2;

      try {
         field2301 = System.getProperty(field2306[0]);
         if (arg0 != 0) {
            return;
         }

         if (field2301 != null) {
            field2301 = field2301 + "/";
         }
      } catch (Exception var3) {
      }

      if (field2301 == null) {
         field2301 = field2306[1];
      }

      field2305 = true;
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1455(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1456(char[] arg0) {
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
            var10005 = 45;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
