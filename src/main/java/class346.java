import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class346 {
   @OriginalMember(
      owner = "client!hs",
      name = "j",
      descriptor = "Z"
   )
   public boolean field4676 = false;
   @OriginalMember(
      owner = "client!hs",
      name = "d",
      descriptor = "I"
   )
   public int field4675 = 1;
   @OriginalMember(
      owner = "client!hs",
      name = "g",
      descriptor = "I"
   )
   public int field4682 = -1;
   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "I"
   )
   public int field4680 = 64;
   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "I"
   )
   public int field4674 = 64;
   @OriginalMember(
      owner = "client!hs",
      name = "c",
      descriptor = "I"
   )
   public int field4679 = 2;
   @OriginalMember(
      owner = "client!hs",
      name = "i",
      descriptor = "Z"
   )
   public boolean field4677 = false;
   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4684 = new String[]{method2536(method2535("\\5vJ")), method2536(method2535("In4\bR")), method2536(method2535("Z34e\u0007")), method2536(method2535("Z34d\u0007")), method2536(method2535("Z34g\u0007"))};
   @OriginalMember(
      owner = "client!hs",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field4678 = new int[32];
   @OriginalMember(
      owner = "client!hs",
      name = "h",
      descriptor = "I"
   )
   public static int field4681;
   @OriginalMember(
      owner = "client!hs",
      name = "f",
      descriptor = "I"
   )
   public static int field4683;

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(Lwf;BI)V",
      line = 8
   )
   public final void method2532(class147 arg0, byte arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg1 > -40) {
            method2533((byte)-127);
         }

         while(true) {
            int var5 = arg0.method1143(-15465);
            if (~var5 != -1) {
               this.method2534(-29437, arg2, var5, arg0);
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            ++field4681;
            break;
         }

      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4684[2] + (arg0 != null ? field4684[1] : field4684[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(B)V",
      line = 33
   )
   public static void method2533(byte arg0) {
      try {
         field4678 = null;
         if (arg0 < 95) {
            field4678 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4684[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(IIILwf;)V",
      line = 47
   )
   private final void method2534(int arg0, int arg1, int arg2, class147 arg3) {
      boolean var5 = client.field4360;

      try {
         if (arg0 != -29437) {
            field4678 = null;
         }

         label81: {
            if (arg2 == 1) {
               this.field4682 = arg3.method1211(-26166);
               if (~this.field4682 != -65536) {
                  break label81;
               }

               this.field4682 = -1;
               if (!var5) {
                  break label81;
               }
            }

            if (arg2 == 2) {
               this.field4680 = arg3.method1211(arg0 + 3271) + 1;
               this.field4674 = arg3.method1211(-26166) + 1;
               if (!var5) {
                  break label81;
               }
            }

            if (~arg2 == -4) {
               arg3.method1162(arg0 + 29441);
               if (!var5) {
                  break label81;
               }
            }

            if (~arg2 == -5) {
               this.field4679 = arg3.method1143(-15465);
               if (!var5) {
                  break label81;
               }
            }

            if (arg2 == 5) {
               this.field4675 = arg3.method1143(-15465);
               if (!var5) {
                  break label81;
               }
            }

            if (arg2 != 6) {
               if (arg2 != 7) {
                  break label81;
               }

               this.field4677 = true;
               if (!var5) {
                  break label81;
               }
            }

            this.field4676 = true;
         }

         ++field4683;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4684[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4684[1] : field4684[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2535(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2536(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
