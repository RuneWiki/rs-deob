import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class641 {
   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9287 = new String[]{method4682(method4681(";}:?/;&v%9w")), method4682(method4681(";}:")), method4682(method4681("v-t*9 \u0018v,?0\"J")), method4682(method4681(";}::56#z:/w")), method4682(method4681("w5f.=;/pb")), method4682(method4681("*0")), method4682(method4681(";}::56)ab")), method4682(method4681("v!|!9\u00074a\".=\u0018")), method4682(method4681("w3x=s")), method4682(method4681("-4p?r0(x(")), method4682(method4681("&h"))};
   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "Z"
   )
   private static boolean field9283 = false;
   @OriginalMember(
      owner = "client!cg",
      name = "b",
      descriptor = "Ljava/util/Hashtable;"
   )
   private static Hashtable field9285 = new Hashtable(16);
   @OriginalMember(
      owner = "client!cg",
      name = "c",
      descriptor = "I"
   )
   private static int field9282;
   @OriginalMember(
      owner = "client!cg",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9284;
   @OriginalMember(
      owner = "client!cg",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9286;

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(ZLjava/lang/String;)Ljava/io/File;"
   )
   public static File method4678(boolean arg0, String arg1) {
      if (arg0) {
         method4678(true, (String)null);
      }

      return method4680(!arg0, field9282, arg1, field9286);
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(BLjava/lang/String;I)V"
   )
   public static void method4679(byte arg0, String arg1, int arg2) {
      field9286 = arg1;
      field9282 = arg2;

      try {
         field9284 = System.getProperty(field9287[9]);
         if (arg0 < 32) {
            field9283 = false;
         }

         if (field9284 != null) {
            field9284 = field9284 + "/";
         }
      } catch (Exception var3) {
      }

      if (field9284 == null) {
         field9284 = field9287[10];
      }

      field9283 = true;
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(ZILjava/lang/String;Ljava/lang/String;)Ljava/io/File;"
   )
   public static File method4680(boolean arg0, int arg1, String arg2, String arg3) {
      if (!field9283) {
         throw new RuntimeException("");
      } else {
         File var4 = (File)field9285.get(arg2);
         if (var4 != null) {
            return var4;
         } else {
            String[] var5 = new String[]{field9287[0], field9287[4], field9287[3], field9287[6], field9287[1], field9284, field9287[8], ""};
            if (!arg0) {
               return null;
            } else {
               String[] var6 = new String[]{field9287[2] + arg1, field9287[7] + arg1};

               for(int var7 = 0; var7 < 2; ++var7) {
                  for(int var8 = 0; ~var8 > ~var6.length; ++var8) {
                     for(int var9 = 0; ~var5.length < ~var9; ++var9) {
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

                                 var11 = new RandomAccessFile(var12, field9287[5]);
                                 int var14 = var11.read();
                                 var11.seek(0L);
                                 var11.write(var14);
                                 var11.seek(0L);
                                 var11.close();
                                 field9285.put(arg2, var12);
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
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4681(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4682(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
