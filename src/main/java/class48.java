import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class48 {
   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field557 = new String[]{method409(method408("\u001f>")), method409(method408("\u0014bOX6\t~GO")), method409(method408("O{KM}\u0019NIK{\ttu")), method409(method408("\u0002+\u0005]q\u000fuE]kN")), method409(method408("\u0013f")), method409(method408("\u0002+\u0005]q\u000f\u007f^\u0005")), method409(method408("\u0002+\u0005")), method409(method408("OwCF}>b^Ej\u0004N")), method409(method408("NcYIy\u0002yO\u0005")), method409(method408("\u0002+\u0005Xk\u0002pIB}N")), method409(method408("NeGZ7"))};
   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "Z"
   )
   private static boolean field553 = false;
   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "Ljava/util/Hashtable;"
   )
   private static Hashtable field555 = new Hashtable(16);
   @OriginalMember(
      owner = "client!gs",
      name = "d",
      descriptor = "I"
   )
   private static int field554;
   @OriginalMember(
      owner = "client!gs",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   private static String field552;
   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private static String field556;

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;"
   )
   public static File method405(int arg0, int arg1, String arg2, String arg3) {
      if (!field553) {
         throw new RuntimeException("");
      } else {
         File var4 = (File)field555.get(arg2);
         if (arg0 != -27954) {
            return null;
         } else if (var4 != null) {
            return var4;
         } else {
            String[] var5 = new String[]{field557[9], field557[8], field557[3], field557[5], field557[6], field556, field557[10], ""};
            String[] var6 = new String[]{field557[2] + arg1, field557[7] + arg1};

            for(int var7 = 0; var7 < 2; ++var7) {
               for(int var8 = 0; ~var6.length < ~var8; ++var8) {
                  for(int var9 = 0; ~var9 > ~var5.length; ++var9) {
                     String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg2;
                     RandomAccessFile var11 = null;

                     try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                           String var13 = var5[var9];
                           if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                              (new File(var5[var9] + var6[var8])).mkdir();
                              if (arg3 != null) {
                                 (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                              }

                              var11 = new RandomAccessFile(var12, field557[4]);
                              int var14 = var11.read();
                              var11.seek(0L);
                              var11.write(var14);
                              var11.seek(0L);
                              var11.close();
                              field555.put(arg2, var12);
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
      owner = "client!gs",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/io/File;"
   )
   public static File method406(String arg0, byte arg1) {
      return arg1 < 66 ? null : method405(-27954, field554, arg0, field552);
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   public static void method407(int arg0, int arg1, String arg2) {
      if (arg1 != 0) {
         method405(-67, 97, (String)null, (String)null);
      }

      field552 = arg2;
      field554 = arg0;

      try {
         field556 = System.getProperty(field557[1]);
         if (field556 != null) {
            field556 = field556 + "/";
         }
      } catch (Exception var3) {
      }

      field553 = true;
      if (field556 == null) {
         field556 = field557[0];
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method408(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method409(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
