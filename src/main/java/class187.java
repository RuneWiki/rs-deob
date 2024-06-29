import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class187 {
   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2296 = new String[]{method1426(method1425("\u0006#%\u0016")), method1426(method1425("\u0013xgTN")), method1426(method1425("\t4(Tq@")), method1426(method1425("\t4(Tr@")), method1426(method1425("\t4(Tp@"))};
   @OriginalMember(
      owner = "client!aba",
      name = "e",
      descriptor = "I"
   )
   public static int field2291;
   @OriginalMember(
      owner = "client!aba",
      name = "b",
      descriptor = "I"
   )
   public static int field2292;
   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "I"
   )
   public static int field2293;
   @OriginalMember(
      owner = "client!aba",
      name = "c",
      descriptor = "I"
   )
   public static int field2294;
   @OriginalMember(
      owner = "client!aba",
      name = "d",
      descriptor = "I"
   )
   public static int field2295;

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(ILbj;Ljava/awt/Frame;)V"
   )
   public static final void method1422(int arg0, class255 arg1, Frame arg2) {
      boolean var3 = client.field4273;

      try {
         ++field2293;
         int var4 = -109 % ((arg0 - 48) / 52);

         label49:
         do {
            class289 var5 = arg1.method1938((byte)127, arg2);
            if (var3) {
               class173.method1347(127, 10L);
            }

            while(true) {
               int var10000;
               if (var5.field3826 != 0) {
                  var10000 = var5.field3826;
                  if (!var3) {
                     if (var10000 == 1) {
                        break label49;
                     }

                     class173.method1347(-74, 100L);
                     break;
                  }
               } else {
                  var10000 = 127;
               }

               class173.method1347(var10000, 10L);
            }
         } while(!var3);

         arg2.setVisible(false);
         arg2.dispose();
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2296[3] + arg0 + ',' + (arg1 != null ? field2296[1] : field2296[0]) + ',' + (arg2 != null ? field2296[1] : field2296[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(Loi;B)Z"
   )
   public static final boolean method1423(class79 arg0, byte arg1) {
      try {
         ++field2295;
         if (arg0 == null) {
            return false;
         } else {
            if (arg1 != -1) {
               method1423((class79)null, (byte)22);
            }

            return class692.method5032(arg0.field980, -arg0.field982 + arg0.field979, -arg0.field986 + arg0.field988, arg0.field990 - arg0.field980, arg0.field986, 862921836, arg0.field982);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2296[4] + (arg0 != null ? field2296[1] : field2296[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(ILfga;)V"
   )
   public static final void method1424(int arg0, class268 arg1) {
      boolean var2 = client.field4273;

      try {
         if (arg1.field3476 != null) {
            arg1.field3476.field4281 = 0;
         }

         arg1.field3474 = false;
         ++field2292;
         class268 var3 = arg1.method650();
         if (var2) {
            method1424(-19896, var3);
            var3 = arg1.method649();
         }

         while(true) {
            int var10000;
            if (var3 == null) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 != -19896) {
                     method1423((class79)null, (byte)72);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = -19896;
            }

            method1424(var10000, var3);
            var3 = arg1.method649();
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2296[2] + arg0 + ',' + (arg1 != null ? field2296[1] : field2296[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1425(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1426(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
