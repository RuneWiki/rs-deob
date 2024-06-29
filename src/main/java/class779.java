import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class779 {
   @OriginalMember(
      owner = "client!jw",
      name = "b",
      descriptor = "I"
   )
   public int field11418;
   @OriginalMember(
      owner = "client!jw",
      name = "c",
      descriptor = "I"
   )
   public int field11413;
   @OriginalMember(
      owner = "client!jw",
      name = "e",
      descriptor = "I"
   )
   public int field11419;
   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "I"
   )
   public int field11416;
   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11421 = new String[]{method5662(method5661("2C&Ql\u000b@zLm?\u001c")), method5662(method5661("6AdI")), method5662(method5661("2C&g+")), method5662(method5661("#\u001a&\u000b~")), method5662(method5661("2C&d+")), method5662(method5661("2C&\u0019j6]|\u001b+")), method5662(method5661("2C&f+"))};
   @OriginalMember(
      owner = "client!jw",
      name = "f",
      descriptor = "I"
   )
   public static int field11414;
   @OriginalMember(
      owner = "client!jw",
      name = "h",
      descriptor = "I"
   )
   public static int field11415;
   @OriginalMember(
      owner = "client!jw",
      name = "g",
      descriptor = "I"
   )
   public static int field11420;
   @OriginalMember(
      owner = "client!jw",
      name = "d",
      descriptor = "Lfq;"
   )
   public static class374 field11417;

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(JI)V",
      line = 4
   )
   public static final void method5658(long arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field11414;
         if (class711.field10694 != null) {
            label71: {
               if (~class648.field9340 != -2 && class648.field9340 != 5) {
                  if (~class648.field9340 != -5) {
                     break label71;
                  }

                  class382.method3105(1259, arg0);
                  if (!var3) {
                     break label71;
                  }
               }

               class500.method3880(arg0, -1);
            }
         }

         class767.method5606(-21362, (long)class308.field4801, class351.field5356);
         if (class288.field4539 != arg1) {
            class462.method3587(class288.field4539, (byte)-120);
         }

         int var4 = 0;
         if (var3) {
            if (class721.field10798[var4]) {
               class730.field10897[var4] = true;
            }

            class12.field158[var4] = class721.field10798[var4];
            class721.field10798[var4] = false;
            ++var4;
         }

         while(true) {
            int var10000;
            if (~class169.field2594 >= ~var4) {
               class771.field11354 = class308.field4801;
               class38.method272((class374)null, -1, -1, 1);
               class99.method968(true, -1, (class374)null, -1);
               var10000 = ~class288.field4539;
               if (!var3) {
                  if (var10000 != 0) {
                     class169.field2594 = 0;
                     class335.method2735(0);
                  }

                  class351.field5356.method701();
                  class286.method2387((byte)91, class351.field5356);
                  int var5 = class162.method1443(-89);
                  if (var5 == -1) {
                     var5 = class436.field6683;
                  }

                  if (var5 == -1) {
                     var5 = class91.field1315;
                  }

                  class296.method2488(var5, arg1);
                  int var6 = class476.field7251.method61((byte)70) << 8;
                  class691.method5091(class476.field7251.field1494 + var6, class476.field7251.field1505 + var6, class476.field7251.field1506, true, class359.field5557);
                  class359.field5557 = 0;
                  return;
               }
            } else {
               var10000 = class721.field10798[var4];
            }

            if (var10000 != 0) {
               class730.field10897[var4] = true;
            }

            class12.field158[var4] = class721.field10798[var4];
            class721.field10798[var4] = false;
            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11421[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(Z[SI)[S",
      line = 71
   )
   public static final short[] method5659(boolean arg0, short[] arg1, int arg2) {
      try {
         ++field11415;
         short[] var3 = new short[arg2];
         class107.method1024(arg1, 0, var3, 0, arg2);
         return !arg0 ? null : var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11421[2] + arg0 + ',' + (arg1 != null ? field11421[3] : field11421[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 87
   )
   public final String toString() {
      try {
         ++field11420;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11421[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "<init>",
      descriptor = "(IIII)V",
      line = 96
   )
   public class779(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field11418 = arg2;
         this.field11413 = arg0;
         this.field11419 = arg3;
         this.field11416 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11421[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(B)V",
      line = 109
   )
   public static void method5660(byte arg0) {
      try {
         if (arg0 == -72) {
            field11417 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11421[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5661(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5662(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
