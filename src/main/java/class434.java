import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class434 {
   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "Lgw;"
   )
   private class179 field6272 = new class179(64);
   @OriginalMember(
      owner = "client!nn",
      name = "f",
      descriptor = "Lhw;"
   )
   private class141 field6281;
   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6282 = new String[]{method3269(method3268("|Q$p<")), method3269(method3268("|Q$q<")), method3269(method3268("|Q$r<")), method3269(method3268("|Jf_")), method3269(method3268("|Q$\u000f}|V~\r<")), method3269(method3268("i\u0011$\u001di")), method3269(method3268("|Q$v<")), method3269(method3268("|Q$w<"))};
   @OriginalMember(
      owner = "client!nn",
      name = "i",
      descriptor = "J"
   )
   public static long field6277 = -1L;
   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "Ltv;"
   )
   public static class584 field6278 = new class584(2);
   @OriginalMember(
      owner = "client!nn",
      name = "j",
      descriptor = "Lgh;"
   )
   public static class572 field6279 = new class572(129, -1);
   @OriginalMember(
      owner = "client!nn",
      name = "g",
      descriptor = "F"
   )
   public static float field6274;
   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "I"
   )
   public static int field6273;
   @OriginalMember(
      owner = "client!nn",
      name = "h",
      descriptor = "I"
   )
   public static int field6275;
   @OriginalMember(
      owner = "client!nn",
      name = "d",
      descriptor = "I"
   )
   public static int field6276;
   @OriginalMember(
      owner = "client!nn",
      name = "e",
      descriptor = "I"
   )
   public static int field6280;

   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "(I)V",
      line = 8
   )
   public static void method3263(int arg0) {
      try {
         field6278 = null;
         if (arg0 != 2) {
            field6278 = null;
         }

         field6279 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6282[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "(I)V",
      line = 20
   )
   public final void method3264(int arg0) {
      try {
         ++field6275;
         if (arg0 != 64) {
            field6279 = null;
         }

         class179 var2 = this.field6272;
         synchronized(this.field6272) {
            this.field6272.method1591((byte)58);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6282[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "(II)Llq;",
      line = 33
   )
   public final class576 method3265(int arg0, int arg1) {
      try {
         ++field6276;
         class179 var3 = this.field6272;
         class576 var4;
         synchronized(this.field6272) {
            var4 = (class576)this.field6272.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field6281;
            byte[] var6;
            synchronized(this.field6281) {
               var6 = this.field6281.method1347((byte)127, arg0, arg1);
            }

            class576 var7 = new class576();
            if (var6 != null) {
               var7.method4255(false, new class473(var6));
            }

            class179 var8 = this.field6272;
            synchronized(this.field6272) {
               this.field6272.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field6282[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(I)V",
      line = 61
   )
   public final void method3266(int arg0) {
      try {
         if (arg0 != 2) {
            this.method3264(101);
         }

         class179 var2 = this.field6272;
         synchronized(this.field6272) {
            this.field6272.method1589((byte)69);
         }

         ++field6280;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6282[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(II)V",
      line = 80
   )
   public final void method3267(int arg0, int arg1) {
      try {
         ++field6273;
         if (arg0 != 2) {
            method3263(-70);
         }

         class179 var3 = this.field6272;
         synchronized(this.field6272) {
            this.field6272.method1579(-19, arg1);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6282[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V",
      line = 102
   )
   public class434(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field6281 = arg2;
         if (this.field6281 != null) {
            this.field6281.method1346(11, 0);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6282[4] + (arg0 != null ? field6282[5] : field6282[3]) + ',' + arg1 + ',' + (arg2 != null ? field6282[5] : field6282[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3268(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3269(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
