import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public abstract class class754 extends class305 {
   @OriginalMember(
      owner = "client!pea",
      name = "w",
      descriptor = "I"
   )
   public int field10954;
   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10957 = new String[]{method5468(method5467("H\u0013\u0019odQ\u0018\u00115f\u0010")), method5468(method5467("H\u0013\u0019o\u001e\u0010"))};
   @OriginalMember(
      owner = "client!pea",
      name = "x",
      descriptor = "I"
   )
   public static int field10953;
   @OriginalMember(
      owner = "client!pea",
      name = "y",
      descriptor = "I"
   )
   public static int field10955;
   @OriginalMember(
      owner = "client!pea",
      name = "v",
      descriptor = "I"
   )
   public static int field10956;

   @OriginalMember(
      owner = "client!pea",
      name = "<init>",
      descriptor = "(I)V",
      line = 6
   )
   public class754(int arg0) {
      try {
         this.field10954 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10957[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(II)I",
      line = 15
   )
   public static final int method5466(int arg0, int arg1) {
      try {
         if (arg0 != 2722) {
            method5466(80, -59);
         }

         ++field10956;
         int var2 = 63 & arg1;
         int var3 = (202 & arg1) >> 6;
         if (~var2 != -19) {
            if (var2 == 19 || var2 == 21) {
               if (var3 == 0) {
                  return 16;
               }

               if (~var3 == -2) {
                  return 32;
               }

               if (~var3 == -3) {
                  return 64;
               }

               if (var3 == 3) {
                  return 128;
               }
            }
         } else {
            if (~var3 == -1) {
               return 1;
            }

            if (~var3 == -2) {
               return 2;
            }

            if (~var3 == -3) {
               return 4;
            }

            if (var3 == 3) {
               return 8;
            }
         }

         return 0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10957[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "b",
      descriptor = "(Z)Ljava/lang/Object;"
   )
   public abstract Object method1864(boolean arg0);

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method1865(int arg0);

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5467(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5468(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
