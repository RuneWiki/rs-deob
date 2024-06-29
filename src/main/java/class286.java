import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class286 {
   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4008 = new String[]{method2227(method2226("acwkzl7,3")), method2227(method2226(",?1pv]*,sag\u0006")), method2227(method2226("-++\u007fra1=3")), method2227(method2226(",39{vz\u0006;}pj<\u0007")), method2227(method2226("p.")), method2227(method2226("acwn`a8;tv-")), method2227(method2226("--5l<")), method2227(method2226("acw")), method2227(method2226("acwkzl=7k`-")), method2227(method2226("w*=n=j65y")), method2227(method2226("|v"))};
   @OriginalMember(
      owner = "client!wd",
      name = "e",
      descriptor = "Z"
   )
   private static boolean field4004 = false;
   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "Ljava/util/Hashtable;"
   )
   private static Hashtable field4005 = new Hashtable(16);
   @OriginalMember(
      owner = "client!wd",
      name = "d",
      descriptor = "I"
   )
   private static int field4006;
   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   private static String field4003;
   @OriginalMember(
      owner = "client!wd",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private static String field4007;

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
      line = 5
   )
   public static File method2223(String arg0, String arg1, int arg2, int arg3) {
      if (!field4004) {
         throw new RuntimeException("");
      } else {
         File var4 = (File)field4005.get(arg0);
         if (arg3 != -3) {
            field4007 = null;
         }

         if (var4 != null) {
            return var4;
         } else {
            String[] var5 = new String[]{field4008[5], field4008[2], field4008[8], field4008[0], field4008[7], field4003, field4008[6], ""};
            String[] var6 = new String[]{field4008[3] + arg2, field4008[1] + arg2};

            for(int var7 = 0; ~var7 > -3; ++var7) {
               for(int var8 = 0; var6.length > var8; ++var8) {
                  for(int var9 = 0; ~var9 > ~var5.length; ++var9) {
                     String var10 = var5[var9] + var6[var8] + "/" + (arg1 != null ? arg1 + "/" : "") + arg0;
                     RandomAccessFile var11 = null;

                     try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                           String var13 = var5[var9];
                           if (~var7 != -2 || ~var13.length() >= -1 || (new File(var13)).exists()) {
                              (new File(var5[var9] + var6[var8])).mkdir();
                              if (arg1 != null) {
                                 (new File(var5[var9] + var6[var8] + "/" + arg1)).mkdir();
                              }

                              var11 = new RandomAccessFile(var12, field4008[4]);
                              int var14 = var11.read();
                              var11.seek(0L);
                              var11.write(var14);
                              var11.seek(0L);
                              var11.close();
                              field4005.put(arg0, var12);
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
      owner = "client!wd",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/io/File;",
      line = 103
   )
   public static File method2224(byte arg0, String arg1) {
      if (arg0 >= -41) {
         field4007 = null;
      }

      return method2223(arg1, field4007, field4006, -3);
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(IILjava/lang/String;)V",
      line = 114
   )
   public static void method2225(int arg0, int arg1, String arg2) {
      field4007 = arg2;
      field4006 = arg1;

      try {
         field4003 = System.getProperty(field4008[9]);
         if (field4003 != null) {
            field4003 = field4003 + "/";
         }
      } catch (Exception var3) {
      }

      if (arg0 != 0) {
         method2224((byte)-124, (String)null);
      }

      if (field4003 == null) {
         field4003 = field4008[10];
      }

      field4004 = true;
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2226(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2227(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
