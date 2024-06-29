import jaclib.memory.heap.NativeHeap;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class311 extends class434 {
   @OriginalMember(
      owner = "client!eo",
      name = "t",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field4423;
   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4429 = new String[]{method2352(method2351("S6%5\u001dX0\u007f7\\")), method2352(method2351("Mw%'\t")), method2352(method2351("S6%M\\")), method2352(method2351("X,ge")), method2352(method2351("S6%J\\")), method2352(method2351("S6%L\\")), method2352(method2351("s\u0016M")), method2352(method2351("S6%K\\")), method2352(method2351("S6%H\\"))};
   @OriginalMember(
      owner = "client!eo",
      name = "m",
      descriptor = "Lsd;"
   )
   public static class101 field4422 = new class101(39, 8);
   @OriginalMember(
      owner = "client!eo",
      name = "u",
      descriptor = "Lsd;"
   )
   public static class101 field4426 = new class101(64, 7);
   @OriginalMember(
      owner = "client!eo",
      name = "s",
      descriptor = "I"
   )
   public static int field4420;
   @OriginalMember(
      owner = "client!eo",
      name = "o",
      descriptor = "I"
   )
   public static int field4421;
   @OriginalMember(
      owner = "client!eo",
      name = "n",
      descriptor = "I"
   )
   public static int field4424;
   @OriginalMember(
      owner = "client!eo",
      name = "r",
      descriptor = "I"
   )
   public static int field4425;
   @OriginalMember(
      owner = "client!eo",
      name = "q",
      descriptor = "I"
   )
   public static int field4427;
   @OriginalMember(
      owner = "client!eo",
      name = "p",
      descriptor = "I"
   )
   public static int field4428;

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(BII)I",
      line = 3
   )
   public static final int method2346(byte arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field4427;
         if (~arg2 == 1) {
            return 12345678;
         } else if (arg2 == -1) {
            if (~arg1 <= -3) {
               if (~arg1 >= -127) {
                  return arg1;
               }

               arg1 = 126;
               if (var3 == 0) {
                  return arg1;
               }
            }

            arg1 = 2;
            return arg1;
         } else {
            if (arg0 != 120) {
               field4421 = 80;
            }

            arg1 = (127 & arg2) * arg1 >> 7;
            if (arg1 < 2) {
               arg1 = 2;
               if (var3 == 0) {
                  return (arg2 & 65408) + arg1;
               }
            }

            if (~arg1 < -127) {
               arg1 = 126;
            }

            return (arg2 & 65408) + arg1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4429[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(B)Lsk;",
      line = 43
   )
   public static final class648 method2347(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field4424;
         class7 var2 = null;
         class648 var3 = new class648(class489.field7224, 0);

         try {
            class12 var4 = class755.field11144.method5212("", true, false);
            if (arg0 > -69) {
               method2348(3);
               if (var1 != 0) {
                  class89.method817(1L, 2535);
               }
            }

            while(var4.field159 == 0) {
               class89.method817(1L, 2535);
            }

            if (~var4.field159 == -2) {
               var2 = (class7)var4.field160;
               byte[] var5 = new byte[(int)var2.method65(false)];
               int var6 = 0;
               if (var1 != 0 || ~var5.length < ~var6) {
                  do {
                     int var7 = var2.method58(true, var5, var6, var5.length - var6);
                     if (~var7 == 0) {
                        throw new IOException(field4429[6]);
                     }

                     var6 += var7;
                  } while(~var5.length < ~var6);
               }

               var3 = new class648(new class128(var5), class489.field7224, 0);
            }
         } catch (Exception var10) {
         }

         try {
            if (var2 != null) {
               var2.method60(false);
            }
         } catch (Exception var9) {
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field4429[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "b",
      descriptor = "(I)V",
      line = 102
   )
   public static void method2348(int arg0) {
      try {
         if (arg0 != 0) {
            method2347((byte)-16);
         }

         field4426 = null;
         field4422 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4429[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "b",
      descriptor = "(B)V",
      line = 113
   )
   public final void method2349(byte arg0) {
      try {
         ++field4428;
         this.field4423.method5082();
         if (arg0 > -101) {
            field4422 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4429[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "<init>",
      descriptor = "(I)V",
      line = 127
   )
   public class311(int arg0) {
      try {
         this.field4423 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4429[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(BLjava/lang/String;Z)V",
      line = 139
   )
   public static final void method2350(byte param0, String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2351(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2352(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
