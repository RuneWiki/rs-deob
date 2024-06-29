import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class208 {
   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2655 = new String[]{method1588(method1587("3yZw/")), method1588(method1587("3yZt/")), method1588(method1587("8<Z\u0018z")), method1588(method1587("-g\u0018Z"))};
   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field2652 = false;
   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "Lhn;"
   )
   public static class751 field2650 = new class751(2, 3);
   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "I"
   )
   public static int field2651;
   @OriginalMember(
      owner = "client!pk",
      name = "d",
      descriptor = "Ldu;"
   )
   public static class374 field2654;
   @OriginalMember(
      owner = "client!pk",
      name = "e",
      descriptor = "[[Lkg;"
   )
   public static class284[][] field2653;

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Z[B)Lbh;"
   )
   public static final class40 method1585(boolean arg0, byte[] arg1) {
      int var2 = client.field4530;

      try {
         ++field2651;
         class40 var3 = new class40();
         class128 var4 = new class128(arg1);
         var4.field1590 = var4.field1552.length + -2;
         int var5 = var4.method1038((byte)-93);
         int var6 = var4.field1552.length - var5 + -18;
         if (arg0) {
            field2654 = null;
         }

         var4.field1590 = var6;
         int var7 = var4.method1041(4758);
         var3.field431 = var4.method1038((byte)-128);
         var3.field430 = var4.method1038((byte)-117);
         var3.field422 = var4.method1038((byte)-117);
         var3.field427 = var4.method1038((byte)-103);
         var3.field415 = var4.method1038((byte)-120);
         var3.field428 = var4.method1038((byte)-97);
         int var8 = var4.method1104(255);
         if (var8 > 0) {
            var3.field426 = new class791[var8];
            int var9 = 0;
            if (var2 != 0 || var9 < var8) {
               do {
                  int var10 = var4.method1038((byte)-124);
                  class791 var11 = new class791(class7.method63(var10, false));
                  var3.field426[var9] = var11;
                  if (var2 != 0 || ~(var10--) < -1) {
                     do {
                        int var12 = var4.method1041(4758);
                        int var13 = var4.method1041(4758);
                        var11.method5682((long)var12, new class10(var13), (byte)7);
                     } while(~(var10--) < -1);
                  }

                  ++var9;
               } while(var9 < var8);
            }
         }

         var4.field1590 = 0;
         var3.field434 = var4.method1056(-20330);
         var3.field419 = new int[var7];
         int var14 = 0;
         if (var2 == 0 && var4.field1590 >= var6) {
            return var3;
         } else {
            do {
               int var15;
               label115: {
                  var15 = var4.method1038((byte)-114);
                  if (~var15 == -4) {
                     if (var3.field435 == null) {
                        var3.field435 = new String[var7];
                     }

                     var3.field435[var14] = var4.method1083((byte)73).intern();
                     if (var2 == 0) {
                        break label115;
                     }
                  }

                  if (~var15 != -55) {
                     if (var3.field424 == null) {
                        var3.field424 = new int[var7];
                     }

                     if (var15 >= 150 || var15 == 21 || var15 == 38 || ~var15 == -40) {
                        var3.field424[var14] = var4.method1104(255);
                        if (var2 == 0) {
                           break label115;
                        }
                     }

                     var3.field424[var14] = var4.method1041(4758);
                     if (var2 == 0) {
                        break label115;
                     }
                  }

                  if (var3.field432 == null) {
                     var3.field432 = new long[var7];
                  }

                  var3.field432[var14] = var4.method1063(124);
               }

               var3.field419[var14++] = var15;
            } while(var4.field1590 < var6);

            return var3;
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field2655[1] + arg0 + ',' + (arg1 != null ? field2655[2] : field2655[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1586(boolean arg0) {
      try {
         field2653 = null;
         if (!arg0) {
            method1585(false, (byte[])null);
         }

         field2650 = null;
         field2654 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2655[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1587(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1588(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
