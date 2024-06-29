import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class453 {
   @OriginalMember(
      owner = "client!bh",
      name = "k",
      descriptor = "Lsia;"
   )
   public class407 field6254 = new class407(20);
   @OriginalMember(
      owner = "client!bh",
      name = "b",
      descriptor = "Lsia;"
   )
   private class407 field6256 = new class407(64);
   @OriginalMember(
      owner = "client!bh",
      name = "f",
      descriptor = "Lww;"
   )
   public class339 field6252;
   @OriginalMember(
      owner = "client!bh",
      name = "c",
      descriptor = "Lww;"
   )
   private class339 field6249;
   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6257 = new String[]{method3476(method3475("G/\u0014\u007fz")), method3476(method3475("G/\u0014zz")), method3476(method3475("G/\u0014|z")), method3476(method3475("G/\u0014{z")), method3476(method3475("G/\u0014}z")), method3476(method3475("G/\u0014\u0002;K.N\u0000z")), method3476(method3475("K2VR")), method3476(method3475("^i\u0014\u0010/"))};
   @OriginalMember(
      owner = "client!bh",
      name = "j",
      descriptor = "I"
   )
   public static int field6246;
   @OriginalMember(
      owner = "client!bh",
      name = "e",
      descriptor = "I"
   )
   public static int field6247;
   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "I"
   )
   public static int field6248;
   @OriginalMember(
      owner = "client!bh",
      name = "d",
      descriptor = "I"
   )
   public static int field6250;
   @OriginalMember(
      owner = "client!bh",
      name = "g",
      descriptor = "I"
   )
   public static int field6251;
   @OriginalMember(
      owner = "client!bh",
      name = "i",
      descriptor = "I"
   )
   public static int field6253;
   @OriginalMember(
      owner = "client!bh",
      name = "h",
      descriptor = "I"
   )
   public static int field6255;

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(BI)Lwia;"
   )
   public final class307 method3470(byte arg0, int arg1) {
      try {
         if (arg0 != 37) {
            this.field6249 = null;
         }

         ++field6248;
         class407 var3 = this.field6256;
         class307 var4;
         synchronized(this.field6256) {
            var4 = (class307)this.field6256.method3192((long)arg1, (byte)-122);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field6249;
            byte[] var6;
            synchronized(this.field6249) {
               var6 = this.field6249.method2697(arg1, 46, false);
            }

            class307 var7 = new class307();
            var7.field4286 = this;
            if (var6 != null) {
               var7.method2458(new class66(var6), (byte)114);
            }

            class407 var8 = this.field6256;
            synchronized(this.field6256) {
               this.field6256.method3190(var7, (long)arg1, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field6257[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3471(byte arg0) {
      try {
         ++field6253;
         class407 var2 = this.field6256;
         synchronized(this.field6256) {
            if (arg0 != -99) {
               this.field6254 = null;
            }

            this.field6256.method3201((byte)105);
         }

         class407 var3 = this.field6254;
         synchronized(this.field6254) {
            this.field6254.method3201((byte)114);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6257[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3472(int arg0, int arg1) {
      try {
         ++field6251;
         if (arg0 >= 1) {
            class407 var3 = this.field6256;
            synchronized(this.field6256) {
               this.field6256.method3197(5, arg1);
            }

            class407 var4 = this.field6254;
            synchronized(this.field6254) {
               this.field6254.method3197(5, arg1);
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6257[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3473(int arg0, int arg1) {
      try {
         ++field6247;
         if (arg0 != 12822) {
            field6246 = 62;
         }

         class487 var2 = class2.method12((long)arg1, 5, (byte)43);
         var2.method3696(-11118);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6257[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3474(byte arg0) {
      try {
         class407 var2 = this.field6256;
         synchronized(this.field6256) {
            this.field6256.method3187(arg0 + -23748);
         }

         ++field6255;
         if (arg0 != -77) {
            this.method3471((byte)40);
         }

         class407 var3 = this.field6254;
         synchronized(this.field6254) {
            this.field6254.method3187(-23825);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6257[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lww;)V"
   )
   public class453(class500 arg0, int arg1, class339 arg2, class339 arg3) {
      try {
         this.field6252 = arg3;
         this.field6249 = arg2;
         this.field6249.method2691(46, -3);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6257[5] + (arg0 != null ? field6257[7] : field6257[6]) + ',' + arg1 + ',' + (arg2 != null ? field6257[7] : field6257[6]) + ',' + (arg3 != null ? field6257[7] : field6257[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3475(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3476(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
