import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class229 {
   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "[I"
   )
   private int[] field2858;
   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2860 = new String[]{method1739(method1738("}gx\"G6")), method1739(method1738("}gx\"9wapx;6")), method1739(method1738("pzu`")), method1739(method1738("e!7\"x")), method1739(method1738("J>9!%")), method1739(method1738("q\u007f|bvp")), method1739(method1738("\"ftk8/1")), method1739(method1738("\"ftk8.1")), method1739(method1738("}gx\"D6")), method1739(method1738(">fi6")), method1739(method1738(">\"9")), method1739(method1738("waoc?"))};
   @OriginalMember(
      owner = "client!cha",
      name = "d",
      descriptor = "I"
   )
   public static int field2856;
   @OriginalMember(
      owner = "client!cha",
      name = "c",
      descriptor = "I"
   )
   public static int field2857;
   @OriginalMember(
      owner = "client!cha",
      name = "b",
      descriptor = "I"
   )
   public static int field2859;

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(BLeq;)Z"
   )
   public static final boolean method1736(byte param0, class223 param1) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cha",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class229(int[] arg0) {
      boolean var2 = client.field4273;
      super();

      try {
         int var3 = 1;
         if (var2) {
            var3 <<= 1;
         }

         while(true) {
            while(var3 <= arg0.length - -(arg0.length >> 1)) {
               var3 <<= 1;
            }

            this.field2858 = new int[var3 + var3];
            if (!var2) {
               int var4 = 0;
               if (var2) {
                  this.field2858[var4] = -1;
                  ++var4;
               }

               while(true) {
                  while(~var4 > ~(var3 + var3)) {
                     this.field2858[var4] = -1;
                     ++var4;
                  }

                  int var5 = 0;
                  if (!var2) {
                     if (!var2 && arg0.length <= var5) {
                        return;
                     }

                     do {
                        int var6 = var3 + -1 & arg0[var5];
                        if (var2) {
                           var6 = var6 - -1 & var3 + -1;
                        }

                        while(~this.field2858[var6 - -var6 - -1] != 0) {
                           var6 = var6 - -1 & var3 + -1;
                        }

                        this.field2858[var6 + var6] = arg0[var5];
                        this.field2858[var6 - -var6 - -1] = var5++;
                     } while(arg0.length > var5);

                     return;
                  }

                  ++var4;
               }
            }

            var3 = 0;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2860[1] + (arg0 != null ? field2860[3] : field2860[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method1737(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2857;
         if (arg1 != 7) {
            return -69;
         } else {
            int var4 = (this.field2858.length >> 1) + -1;
            int var5 = arg0 & var4;

            while(true) {
               int var6 = this.field2858[var5 + 1 + var5];
               int var10000;
               if (var6 == -1) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = arg0;
               }

               if (var10000 == this.field2858[var5 + var5]) {
                  return var6;
               }

               var5 = var5 - -1 & var4;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2860[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1738(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1739(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
