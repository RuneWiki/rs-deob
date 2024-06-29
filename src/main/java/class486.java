import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class486 extends class434 {
   @OriginalMember(
      owner = "client!vq",
      name = "u",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field7197;
   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7198 = new String[]{method3608(method3607("4\u000e\u0011p\u001f")), method3608(method3607("9Q\u0011\u001bJ")), method3608(method3607(",\nSY")), method3608(method3607("4\u000e\u0011w\u001f")), method3608(method3607("4\u000e\u0011\t^,\u0016K\u000b\u001f")), method3608(method3607("4\u000e\u0011v\u001f")), method3608(method3607("4\u000e\u0011t\u001f")), method3608(method3607("4\u000e\u0011q\u001f"))};
   @OriginalMember(
      owner = "client!vq",
      name = "o",
      descriptor = "I"
   )
   public static int field7190;
   @OriginalMember(
      owner = "client!vq",
      name = "n",
      descriptor = "I"
   )
   public static int field7191;
   @OriginalMember(
      owner = "client!vq",
      name = "q",
      descriptor = "I"
   )
   public static int field7192;
   @OriginalMember(
      owner = "client!vq",
      name = "s",
      descriptor = "I"
   )
   public static int field7193;
   @OriginalMember(
      owner = "client!vq",
      name = "r",
      descriptor = "I"
   )
   public static int field7195;
   @OriginalMember(
      owner = "client!vq",
      name = "t",
      descriptor = "Lvh;"
   )
   public static class378 field7189;
   @OriginalMember(
      owner = "client!vq",
      name = "m",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field7196;
   @OriginalMember(
      owner = "client!vq",
      name = "p",
      descriptor = "[Lat;"
   )
   public static class396[] field7194;

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public final void method3602(byte arg0) {
      try {
         ++field7193;
         this.field7197.method5082();
         if (arg0 >= -81) {
            this.field7197 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7198[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Lsda;BLpe;)Lld;",
      line = 14
   )
   public static final class180 method3603(class269 arg0, byte arg1, class634 arg2) {
      int var3 = client.field4530;

      try {
         class180 var4;
         label60: {
            ++field7195;
            var4 = class777.method5597(-111);
            var4.field2214 = arg0;
            var4.field2215 = arg0.field3759;
            if (~var4.field2215 == 0) {
               var4.field2211 = new class520(260);
               if (var3 == 0) {
                  break label60;
               }
            }

            if (~var4.field2215 == 1) {
               var4.field2211 = new class520(10000);
               if (var3 == 0) {
                  break label60;
               }
            }

            if (~var4.field2215 < -19) {
               if (var4.field2215 > 98) {
                  var4.field2211 = new class520(260);
                  if (var3 == 0) {
                     break label60;
                  }
               }

               var4.field2211 = new class520(100);
               if (var3 == 0) {
                  break label60;
               }
            }

            var4.field2211 = new class520(20);
         }

         var4.field2211.method3836(-1, arg2);
         if (arg1 > -7) {
            return null;
         } else {
            var4.field2211.method3838(23928, var4.field2214.method2079(0));
            var4.field2217 = 0;
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7198[0] + (arg0 != null ? field7198[1] : field7198[2]) + ',' + arg1 + ',' + (arg2 != null ? field7198[1] : field7198[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "(I)V",
      line = 55
   )
   public static void method3604(int arg0) {
      try {
         field7196 = null;
         field7189 = null;
         if (arg0 > 49) {
            field7194 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7198[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(BII)B",
      line = 67
   )
   public static final byte method3605(byte arg0, int arg1, int arg2) {
      try {
         ++field7190;
         if (~arg2 != -10) {
            return 0;
         } else {
            int var3 = -21 % ((40 - arg0) / 41);
            return (byte)((1 & arg1) == 0 ? 1 : 2);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7198[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Ljj;Z)Lih;",
      line = 87
   )
   public static final class728 method3606(class128 arg0, boolean arg1) {
      try {
         ++field7192;
         return !arg1 ? null : new class728(arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1077(-33), arg0.method1104(255));
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7198[6] + (arg0 != null ? field7198[1] : field7198[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "<init>",
      descriptor = "(I)V",
      line = 100
   )
   public class486(int arg0) {
      try {
         this.field7197 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7198[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3608(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
