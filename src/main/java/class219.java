import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class219 {
   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3133 = new String[]{method1728(method1727("d\\\f\u00021")), method1728(method1727("dZ\u0012\u0011\u007f(@\u0004]")), method1728(method1727("(\u0012N\u0005w%L\u000e\u0005md")), method1728(method1727("eN\b\u001e{\u0014[\u0015\u001dl.w")), method1728(method1727("(\u0012N")), method1728(method1727("(\u0012N\u0000m(I\u0002\u001a{d")), method1728(method1727("9_")), method1728(method1727("eB\u0000\u0015{3w\u0002\u0013}#M>")), method1728(method1727("(\u0012N\u0005w%F\u0015]")), method1728(method1727("5\u0007")), method1728(method1727(">[\u0004\u00000#G\f\u0017"))};
   @OriginalMember(
      owner = "client!hi",
      name = "e",
      descriptor = "Z"
   )
   private static boolean field3130 = false;
   @OriginalMember(
      owner = "client!hi",
      name = "c",
      descriptor = "Ljava/util/Hashtable;"
   )
   private static Hashtable field3131 = new Hashtable(16);
   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "I"
   )
   private static int field3129;
   @OriginalMember(
      owner = "client!hi",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private static String field3128;
   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private static String field3132;

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(Ljava/lang/String;II)V",
      line = 6
   )
   public static void method1724(String arg0, int arg1, int arg2) {
      field3128 = arg0;
      field3129 = arg2;

      try {
         field3132 = System.getProperty(field3133[10]);
         if (arg1 != -22986) {
            return;
         }

         if (field3132 != null) {
            field3132 = field3132 + "/";
         }
      } catch (Exception var3) {
      }

      if (field3132 == null) {
         field3132 = field3133[9];
      }

      field3130 = true;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;",
      line = 29
   )
   public static File method1725(int arg0, String arg1, String arg2, int arg3) {
      if (!field3130) {
         throw new RuntimeException("");
      } else {
         File var4 = (File)field3131.get(arg1);
         if (var4 != null) {
            return var4;
         } else {
            String[] var5 = new String[]{field3133[5], field3133[1], field3133[2], field3133[8], field3133[4], field3132, field3133[0], ""};
            String[] var6 = new String[]{field3133[7] + arg3, field3133[3] + arg3};

            for(int var7 = 0; ~var7 > -3; ++var7) {
               for(int var8 = 0; var6.length > var8; ++var8) {
                  for(int var9 = 0; ~var9 > ~var5.length; ++var9) {
                     String var10 = var5[var9] + var6[var8] + "/" + (arg2 != null ? arg2 + "/" : "") + arg1;
                     RandomAccessFile var11 = null;

                     try {
                        File var12 = new File(var10);
                        if (~var7 != -1 || var12.exists()) {
                           String var13 = var5[var9];
                           if (var7 != 1 || ~var13.length() >= -1 || (new File(var13)).exists()) {
                              (new File(var5[var9] + var6[var8])).mkdir();
                              if (arg2 != null) {
                                 (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                              }

                              var11 = new RandomAccessFile(var12, field3133[6]);
                              int var14 = var11.read();
                              var11.seek(0L);
                              var11.write(var14);
                              var11.seek(0L);
                              var11.close();
                              field3131.put(arg1, var12);
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

            if (arg0 <= 33) {
               return null;
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
      line = 123
   )
   public static File method1726(String arg0, int arg1) {
      if (arg1 != 0) {
         method1725(46, (String)null, (String)null, 122);
      }

      return method1725(arg1 ^ 121, arg0, field3128, field3129);
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1727(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1728(char[] arg0) {
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
            var10005 = 40;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
