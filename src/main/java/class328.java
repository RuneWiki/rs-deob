import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class328 extends class82 {
   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4544 = new String[]{method2608(method2607("^u=}B")), method2608(method2607("^u=zB")), method2608(method2607("^u={B")), method2608(method2607("^u=xB")), method2608(method2607("Go\u007fU")), method2608(method2607("R4=\u0017\u0017"))};
   @OriginalMember(
      owner = "client!wo",
      name = "m",
      descriptor = "Lhv;"
   )
   public static class227 field4539 = new class227(16);
   @OriginalMember(
      owner = "client!wo",
      name = "g",
      descriptor = "I"
   )
   public static int field4543 = -1;
   @OriginalMember(
      owner = "client!wo",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field4542 = false;
   @OriginalMember(
      owner = "client!wo",
      name = "l",
      descriptor = "I"
   )
   public static int field4536;
   @OriginalMember(
      owner = "client!wo",
      name = "h",
      descriptor = "I"
   )
   public static int field4537;
   @OriginalMember(
      owner = "client!wo",
      name = "n",
      descriptor = "I"
   )
   public static int field4541;
   @OriginalMember(
      owner = "client!wo",
      name = "o",
      descriptor = "Lnl;"
   )
   public class713 field4540;
   @OriginalMember(
      owner = "client!wo",
      name = "j",
      descriptor = "Z"
   )
   public boolean field4535;
   @OriginalMember(
      owner = "client!wo",
      name = "i",
      descriptor = "[Lmia;"
   )
   public class687[] field4538;

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(ILha;II)Z"
   )
   public final boolean method2603(int arg0, class479 arg1, int arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         ++field4541;
         int var6 = this.field4540.method789(79);
         boolean var10000;
         int var7;
         if (this.field4538 != null) {
            var7 = 0;
            if (var5) {
               this.field4538[var7].field10116 <<= var6;
               var10000 = this.field4538[var7].method5026(arg3, arg0);
            } else if (~var7 <= ~this.field4538.length) {
               var7 = 91 / ((arg2 - 50) / 58);
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               this.field4538[var7].field10116 <<= var6;
               var10000 = this.field4538[var7].method5026(arg3, arg0);
            }
         } else {
            var7 = 91 / ((arg2 - 50) / 58);
            var10000 = false;
            if (!var5) {
               return false;
            }
         }

         while(!var10000 || !this.field4540.method185(arg1, arg3, true, arg0)) {
            this.field4538[var7].field10116 >>= var6;
            ++var7;
            if (~var7 <= ~this.field4538.length) {
               var7 = 91 / ((arg2 - 50) / 58);
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               this.field4538[var7].field10116 <<= var6;
               var10000 = this.field4538[var7].method5026(arg3, arg0);
            }
         }

         this.field4538[var7].field10116 >>= var6;
         return true;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4544[3] + arg0 + ',' + (arg1 != null ? field4544[5] : field4544[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2604(boolean arg0) {
      try {
         field4539 = null;
         if (arg0) {
            field4543 = -4;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4544[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method2605(int arg0, int arg1) {
      try {
         ++field4537;
         class407 var2 = class137.field1737;
         synchronized(class137.field1737) {
            if (arg1 == -1) {
               class137.field1737.method3197(5, arg0);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4544[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method2606(byte arg0, int arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field4536;
         if (class533.field7825 != 0) {
            label40: {
               if (arg2 >= 0) {
                  class259.field3298[arg2] = arg1;
                  if (!var3) {
                     break label40;
                  }
               }

               int var4 = 0;
               if (var3) {
                  class259.field3298[var4] = arg1;
                  ++var4;
               }

               while(~var4 > -17) {
                  class259.field3298[var4] = arg1;
                  ++var4;
               }
            }
         }

         if (arg0 >= -39) {
            field4542 = true;
         }

         class98.field1305.method5147(arg2, arg1, (byte)124);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4544[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2608(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
