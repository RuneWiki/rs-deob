import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class85 {
   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1175 = new String[]{method812(method811("|'")), method812(method811("mjbYo`4\"Yu!")), method812(method811("!$ ^)")), method812(method811("mjbYo`>9\u0001")), method812(method811("mjb\\um1.Fc!")), method812(method811(" :,Icv\u000f.Oef5\u0012")), method812(method811("!\">Mgm8(\u0001")), method812(method811(" 6$BcQ#9Atk\u000f")), method812(method811("mjb")), method812(method811("p\u007f")), method812(method811("{#(\\(f? K"))};
   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "Z"
   )
   private static boolean field1174 = false;
   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "Ljava/util/Hashtable;"
   )
   private static Hashtable field1173 = new Hashtable(16);
   @OriginalMember(
      owner = "client!kj",
      name = "e",
      descriptor = "I"
   )
   private static int field1170;
   @OriginalMember(
      owner = "client!kj",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private static String field1171;
   @OriginalMember(
      owner = "client!kj",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private static String field1172;

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   public static void method808(int arg0, int arg1, String arg2) {
      field1170 = arg0;
      if (arg1 != 0) {
         field1174 = false;
      }

      field1172 = arg2;

      try {
         field1171 = System.getProperty(field1175[10]);
         if (field1171 != null) {
            field1171 = field1171 + "/";
         }
      } catch (Exception var3) {
      }

      if (field1171 == null) {
         field1171 = field1175[9];
      }

      field1174 = true;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/io/File;"
   )
   public static File method809(int arg0, String arg1) {
      if (arg0 != -443) {
         field1171 = null;
      }

      return method810(field1170, field1172, -83, arg1);
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;"
   )
   public static File method810(int arg0, String arg1, int arg2, String arg3) {
      if (!field1174) {
         throw new RuntimeException("");
      } else {
         File var4 = (File)field1173.get(arg3);
         if (var4 != null) {
            return var4;
         } else {
            String[] var5 = new String[]{field1175[4], field1175[6], field1175[1], field1175[3], field1175[8], field1171, field1175[2], ""};
            String[] var6 = new String[]{field1175[5] + arg0, field1175[7] + arg0};

            for(int var7 = 0; ~var7 > -3; ++var7) {
               for(int var8 = 0; var6.length > var8; ++var8) {
                  for(int var9 = 0; var5.length > var9; ++var9) {
                     String var10 = var5[var9] + var6[var8] + "/" + (arg1 != null ? arg1 + "/" : "") + arg3;
                     RandomAccessFile var11 = null;

                     try {
                        File var12 = new File(var10);
                        if (~var7 != -1 || var12.exists()) {
                           String var13 = var5[var9];
                           if (var7 != 1 || ~var13.length() >= -1 || (new File(var13)).exists()) {
                              (new File(var5[var9] + var6[var8])).mkdir();
                              if (arg1 != null) {
                                 (new File(var5[var9] + var6[var8] + "/" + arg1)).mkdir();
                              }

                              var11 = new RandomAccessFile(var12, field1175[0]);
                              int var14 = var11.read();
                              var11.seek(0L);
                              var11.write(var14);
                              var11.seek(0L);
                              var11.close();
                              field1173.put(arg3, var12);
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

            if (arg2 >= -32) {
               return null;
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method811(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method812(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
