import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class533 {
   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7787 = new String[]{method3958(method3957("QI\b\"5LU\u00005")), method3958(method3957("Z\u0015")), method3958(method3957("G\u0000B")), method3958(method3957("\u000bN\u0000 4")), method3958(method3957("G\u0000B\"hG[\u000e8~\u000b")), method3958(method3957("VM")), method3958(method3957("G\u0000B'rJ^\u0002'h\u000b")), method3958(method3957("\u000bH\u001e3zGR\b\u007f")), method3958(method3957("\n\\\u0004<~{I\u0019?iAe")), method3958(method3957("\nP\f7~\\e\u000e1xL_2")), method3958(method3957("G\u0000B'rJT\u0019\u007f"))};
   @OriginalMember(
      owner = "client!ek",
      name = "e",
      descriptor = "Z"
   )
   private static boolean field7785 = false;
   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "Ljava/util/Hashtable;"
   )
   private static Hashtable field7786 = new Hashtable(16);
   @OriginalMember(
      owner = "client!ek",
      name = "d",
      descriptor = "I"
   )
   private static int field7783;
   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   private static String field7782;
   @OriginalMember(
      owner = "client!ek",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private static String field7784;

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
      line = 6
   )
   public static File method3954(String arg0, byte arg1) {
      int var2 = 26 / ((arg1 - -34) / 48);
      return method3956(field7782, arg0, -119, field7783);
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V",
      line = 15
   )
   public static void method3955(int arg0, String arg1, int arg2) {
      field7783 = arg0;
      field7782 = arg1;

      try {
         field7784 = System.getProperty(field7787[0]);
         if (field7784 != null) {
            field7784 = field7784 + "/";
         }
      } catch (Exception var3) {
      }

      field7785 = true;
      if (arg2 != 1) {
         method3956((String)null, (String)null, -20, -5);
      }

      if (field7784 == null) {
         field7784 = field7787[1];
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
      line = 43
   )
   public static File method3956(String arg0, String arg1, int arg2, int arg3) {
      if (!field7785) {
         throw new RuntimeException("");
      } else {
         File var4 = (File)field7786.get(arg1);
         if (var4 != null) {
            return var4;
         } else {
            if (arg2 > -49) {
               field7783 = 95;
            }

            String[] var5 = new String[]{field7787[4], field7787[7], field7787[6], field7787[10], field7787[2], field7784, field7787[3], ""};
            String[] var6 = new String[]{field7787[9] + arg3, field7787[8] + arg3};

            for(int var7 = 0; ~var7 > -3; ++var7) {
               for(int var8 = 0; ~var8 > ~var6.length; ++var8) {
                  for(int var9 = 0; var5.length > var9; ++var9) {
                     String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
                     RandomAccessFile var11 = null;

                     try {
                        File var12 = new File(var10);
                        if (~var7 != -1 || var12.exists()) {
                           String var13 = var5[var9];
                           if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                              (new File(var5[var9] + var6[var8])).mkdir();
                              if (arg0 != null) {
                                 (new File(var5[var9] + var6[var8] + "/" + arg0)).mkdir();
                              }

                              var11 = new RandomAccessFile(var12, field7787[5]);
                              int var14 = var11.read();
                              var11.seek(0L);
                              var11.write(var14);
                              var11.seek(0L);
                              var11.close();
                              field7786.put(arg1, var12);
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

            throw new RuntimeException();
         }
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3957(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3958(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
