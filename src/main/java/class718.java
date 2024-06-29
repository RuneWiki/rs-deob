import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class718 extends class294 {
   @OriginalMember(
      owner = "client!pj",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field10763;
   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10768 = new String[]{method5317(method5316("Zpv}\u0015")), method5317(method5316("Q4vo\u0001O7,m@")), method5317(method5316("O+4?")), method5317(method5316("Q4v\u0012@")), method5317(method5316("Q4v\u0011@"))};
   @OriginalMember(
      owner = "client!pj",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field10764 = true;
   @OriginalMember(
      owner = "client!pj",
      name = "u",
      descriptor = "Lnaa;"
   )
   public static class113 field10760 = new class113(31, 15);
   @OriginalMember(
      owner = "client!pj",
      name = "r",
      descriptor = "Lnaa;"
   )
   public static class113 field10765 = new class113(71, 4);
   @OriginalMember(
      owner = "client!pj",
      name = "p",
      descriptor = "Lnaa;"
   )
   public static class113 field10766 = new class113(5, 0);
   @OriginalMember(
      owner = "client!pj",
      name = "o",
      descriptor = "Lnaa;"
   )
   public static class113 field10767 = new class113(7, 6);
   @OriginalMember(
      owner = "client!pj",
      name = "q",
      descriptor = "I"
   )
   public static int field10759;
   @OriginalMember(
      owner = "client!pj",
      name = "n",
      descriptor = "I"
   )
   public static int field10762;
   @OriginalMember(
      owner = "client!pj",
      name = "s",
      descriptor = "Lnf;"
   )
   public static class782 field10761;

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(Z)V",
      line = 5
   )
   public static void method5314(boolean arg0) {
      try {
         field10766 = null;
         field10760 = null;
         if (arg0) {
            field10767 = null;
            field10761 = null;
            field10765 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10768[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "<init>",
      descriptor = "()V",
      line = 27
   )
   public class718() {
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(IIZLfq;I)V",
      line = 34
   )
   public static final void method5315(int arg0, int arg1, boolean arg2, class374 arg3, int arg4) {
      try {
         ++field10759;
         int var5 = arg3.field5849;
         if (arg3.field5868 == 0) {
            arg3.field5849 = arg3.field5871;
         } else if (~arg3.field5868 == -2) {
            arg3.field5849 = -arg3.field5871 + arg1;
         } else if (~arg3.field5868 == -3) {
            arg3.field5849 = arg3.field5871 * arg1 >> 14;
         }

         int var6 = arg3.field5915;
         if (arg3.field5807 == 0) {
            arg3.field5915 = arg3.field5797;
         } else if (~arg3.field5807 == -2) {
            arg3.field5915 = -arg3.field5797 + arg0;
         } else if (arg3.field5807 == 2) {
            arg3.field5915 = arg3.field5797 * arg0 >> 14;
         }

         if (arg4 != 6227) {
            method5314(false);
         }

         if (arg3.field5868 == 4) {
            arg3.field5849 = arg3.field5915 * arg3.field5796 / arg3.field5866;
         }

         if (~arg3.field5807 == -5) {
            arg3.field5915 = arg3.field5866 * arg3.field5849 / arg3.field5796;
         }

         if (class351.field5351 && (client.method1148(arg3).field898 != 0 || arg3.field5910 == 0)) {
            if (arg3.field5915 < 5 && arg3.field5849 < 5) {
               arg3.field5849 = 5;
               arg3.field5915 = 5;
            } else {
               if (arg3.field5849 <= 0) {
                  arg3.field5849 = 5;
               }

               if (arg3.field5915 <= 0) {
                  arg3.field5915 = 5;
               }
            }
         }

         if (~class707.field10649 == ~arg3.field5917) {
            class494.field7460 = arg3;
         }

         if (arg2 && arg3.field5852 != null) {
            if (arg3.field5849 != var5 || ~arg3.field5915 != ~var6) {
               class36 var7 = new class36();
               var7.field437 = arg3.field5852;
               var7.field441 = arg3;
               class678.field10117.method4980(var7, 0);
            }

         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10768[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10768[0] : field10768[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 111
   )
   public class718(String arg0, int arg1) {
      try {
         this.field10763 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10768[1] + (arg0 != null ? field10768[0] : field10768[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5317(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
