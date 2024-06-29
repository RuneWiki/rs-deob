import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class454 {
   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "I"
   )
   public int field6947;
   @OriginalMember(
      owner = "client!ep",
      name = "c",
      descriptor = "Lc;"
   )
   private class652 field6946;
   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6950 = new String[]{method3558(method3557("n;|jw")), method3558(method3557("{`>(")), method3558(method3557("pe|xc{|&z\"")), method3558(method3557("pe|\"c{t>-pp="))};
   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "I"
   )
   public static int field6948 = 0;
   @OriginalMember(
      owner = "client!ep",
      name = "d",
      descriptor = "I"
   )
   public static int field6949;

   @OriginalMember(
      owner = "client!ep",
      name = "finalize",
      descriptor = "()V",
      line = 5
   )
   protected final void finalize() throws Throwable {
      try {
         this.field6946.method4747(this.field6947, -120);
         ++field6949;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6950[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(I)V",
      line = 21
   )
   public static final void method3556(int arg0) {
      if (arg0 == 0) {
         if (class774.field11384 == 2) {
            class238.field3620[0].method4100(class659.field9842[0]);
            class238.field3620[1].method4100(class659.field9842[1]);
         } else if (class774.field11384 == 3) {
            class238.field3620[0].method4100(class659.field9842[0]);
            class238.field3620[1].method4100(class659.field9842[1]);
            class238.field3620[2].method4100(class659.field9842[2]);
         } else {
            class238.field3620[0].method4100(class659.field9842[0]);
            class238.field3620[1].method4100(class659.field9842[1]);
            class238.field3620[2].method4100(class659.field9842[2]);
            class238.field3620[3].method4100(class659.field9842[3]);
         }
      } else if (arg0 == 1) {
         if (class774.field11384 == 2) {
            class238.field3620[0].method4100(class659.field9842[2]);
         } else if (class774.field11384 == 3) {
            class238.field3620[0].method4100(class659.field9842[3]);
            class238.field3620[1].method4100(class659.field9842[4]);
         } else {
            class238.field3620[0].method4100(class659.field9842[4]);
            class238.field3620[1].method4100(class659.field9842[5]);
            class238.field3620[2].method4100(class659.field9842[6]);
         }
      } else {
         if (arg0 == 2) {
            if (class774.field11384 == 2) {
               class238.field3620[0].method4100(class659.field9842[3]);
               return;
            }

            if (class774.field11384 == 3) {
               class238.field3620[0].method4100(class659.field9842[5]);
               return;
            }

            class238.field3620[0].method4100(class659.field9842[7]);
         }

      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "<init>",
      descriptor = "(Lc;II)V",
      line = 90
   )
   public class454(class652 arg0, int arg1, int arg2) {
      try {
         this.field6947 = arg2;
         this.field6946 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6950[2] + (arg0 != null ? field6950[0] : field6950[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3557(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3558(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
