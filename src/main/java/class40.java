import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 extends class438 {
   @OriginalMember(
      owner = "client!bh",
      name = "x",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field564;
   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field570 = new String[]{method353(method352("Sg3nv_fil7")), method353(method352("Sg3\u00167")), method353(method352("J!3|b")), method353(method352("Sg3\u00177")), method353(method352("_zq>")), method353(method352("Sg3\u00107")), method353(method352("Sg3\u00117"))};
   @OriginalMember(
      owner = "client!bh",
      name = "v",
      descriptor = "J"
   )
   public static long field563 = -1L;
   @OriginalMember(
      owner = "client!bh",
      name = "u",
      descriptor = "Lek;"
   )
   public static class536 field567 = new class536(62, -1);
   @OriginalMember(
      owner = "client!bh",
      name = "q",
      descriptor = "Lek;"
   )
   public static class536 field568 = new class536(4, -1);
   @OriginalMember(
      owner = "client!bh",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field569 = true;
   @OriginalMember(
      owner = "client!bh",
      name = "y",
      descriptor = "I"
   )
   public static int field561;
   @OriginalMember(
      owner = "client!bh",
      name = "s",
      descriptor = "I"
   )
   public static int field562;
   @OriginalMember(
      owner = "client!bh",
      name = "r",
      descriptor = "I"
   )
   public static int field565;
   @OriginalMember(
      owner = "client!bh",
      name = "w",
      descriptor = "I"
   )
   public static int field566;

   @OriginalMember(
      owner = "client!bh",
      name = "<init>",
      descriptor = "(I)V",
      line = 7
   )
   public class40(int arg0) {
      try {
         this.field564 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field570[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "b",
      descriptor = "(I)V",
      line = 15
   )
   public static void method348(int arg0) {
      try {
         if (arg0 >= -34) {
            method348(101);
         }

         field568 = null;
         field567 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field570[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public final void method349(int arg0) {
      try {
         if (arg0 != -16851) {
            method351((byte)-38, 10);
         }

         this.field564.method5097();
         ++field566;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field570[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(Lek;Lqi;Z)Lij;",
      line = 42
   )
   public static final class447 method350(class536 arg0, class594 arg1, boolean arg2) {
      boolean var3 = client.field4360;

      try {
         if (!arg2) {
            return null;
         } else {
            class447 var4;
            label52: {
               ++field561;
               var4 = class75.method685(-66);
               var4.field6358 = arg0;
               var4.field6354 = arg0.field7669;
               if (var4.field6354 != -1) {
                  if (var4.field6354 == -2) {
                     var4.field6359 = new class534(10000);
                     if (!var3) {
                        break label52;
                     }
                  }

                  if (var4.field6354 > 18) {
                     if (~var4.field6354 >= -99) {
                        var4.field6359 = new class534(100);
                        if (!var3) {
                           break label52;
                        }
                     }

                     var4.field6359 = new class534(260);
                     if (!var3) {
                        break label52;
                     }
                  }

                  var4.field6359 = new class534(20);
                  if (!var3) {
                     break label52;
                  }
               }

               var4.field6359 = new class534(260);
            }

            var4.field6359.method3847((byte)99, arg1);
            var4.field6359.method3846(var4.field6358.method3873(-56), -85);
            var4.field6352 = 0;
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field570[3] + (arg0 != null ? field570[2] : field570[4]) + ',' + (arg1 != null ? field570[2] : field570[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(BI)V",
      line = 78
   )
   public static final void method351(byte arg0, int arg1) {
      try {
         int var2 = -71 % ((arg0 - 59) / 57);
         ++field562;
         class755 var3 = class317.method2325((long)arg1, 116, 14);
         var3.method5481(-119);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field570[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
