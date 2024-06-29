import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class685 extends class213 {
   @OriginalMember(
      owner = "client!pb",
      name = "O",
      descriptor = "I"
   )
   private int field10057 = 2048;
   @OriginalMember(
      owner = "client!pb",
      name = "I",
      descriptor = "I"
   )
   private int field10054 = 0;
   @OriginalMember(
      owner = "client!pb",
      name = "K",
      descriptor = "I"
   )
   private int field10056 = 10;
   @OriginalMember(
      owner = "client!pb",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10064 = new String[]{method5010(method5009("\u0001?\u001aTv")), method5010(method5009("\u0001?\u001aZv")), method5010(method5009("\u0001?\u001a[v")), method5010(method5009("\u0001?\u001a\\v")), method5010(method5009("\u0001?\u001a]v")), method5010(method5009("\u0001?\u001a^v")), method5010(method5009("\ns\u001a1#")), method5010(method5009("\u001f(Xs")), method5010(method5009("\u0001?\u001aXv"))};
   @OriginalMember(
      owner = "client!pb",
      name = "P",
      descriptor = "[I"
   )
   public static int[] field10059 = new int[1];
   @OriginalMember(
      owner = "client!pb",
      name = "L",
      descriptor = "Lnw;"
   )
   public static class616 field10051 = new class616(85, -1);
   @OriginalMember(
      owner = "client!pb",
      name = "Q",
      descriptor = "Lbga;"
   )
   public static class378 field10062 = new class378(137, 8);
   @OriginalMember(
      owner = "client!pb",
      name = "F",
      descriptor = "I"
   )
   public static int field10063 = 0;
   @OriginalMember(
      owner = "client!pb",
      name = "M",
      descriptor = "I"
   )
   public static int field10049;
   @OriginalMember(
      owner = "client!pb",
      name = "R",
      descriptor = "I"
   )
   public static int field10050;
   @OriginalMember(
      owner = "client!pb",
      name = "J",
      descriptor = "I"
   )
   public static int field10053;
   @OriginalMember(
      owner = "client!pb",
      name = "G",
      descriptor = "I"
   )
   public static int field10055;
   @OriginalMember(
      owner = "client!pb",
      name = "E",
      descriptor = "I"
   )
   public static int field10058;
   @OriginalMember(
      owner = "client!pb",
      name = "H",
      descriptor = "I"
   )
   public static int field10060;
   @OriginalMember(
      owner = "client!pb",
      name = "D",
      descriptor = "[I"
   )
   private int[] field10052;
   @OriginalMember(
      owner = "client!pb",
      name = "N",
      descriptor = "[I"
   )
   private int[] field10061;

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label42: {
            label41: {
               label40: {
                  ++field10055;
                  if (arg2 != 0) {
                     if (~arg2 == -2) {
                        break label40;
                     }

                     if (arg2 != 2) {
                        break label42;
                     }

                     if (!var4) {
                        break label41;
                     }
                  }

                  this.field10056 = arg0.method4288((byte)125);
                  if (!var4) {
                     break label42;
                  }
               }

               this.field10057 = arg0.method4280(-19104);
               if (!var4) {
                  break label42;
               }
            }

            this.field10054 = arg0.method4288((byte)125);
         }

         int var6 = 56 / ((arg1 - 68) / 48);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10064[8] + (arg0 != null ? field10064[6] : field10064[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "(IB)Z"
   )
   public static final boolean method5005(int arg0, byte arg1) {
      try {
         if (arg1 <= 106) {
            field10063 = 68;
         }

         ++field10050;
         return ~(arg0 & -arg0) == ~arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10064[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method5006(int arg0) {
      try {
         field10059 = null;
         field10051 = null;
         field10062 = null;
         if (arg0 != 1) {
            field10051 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10064[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method5007(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pb",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method5008(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pb",
      name = "<init>",
      descriptor = "()V"
   )
   public class685() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!pb",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         if (arg0 != 28274) {
            method5005(14, (byte)-40);
         }

         ++field10053;
         this.method5007(112);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10064[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5009(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5010(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
