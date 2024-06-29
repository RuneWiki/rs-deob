import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class273 implements class603 {
   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "Lww;"
   )
   private class339 field3488;
   @OriginalMember(
      owner = "client!es",
      name = "e",
      descriptor = "Lww;"
   )
   private class339 field3489;
   @OriginalMember(
      owner = "client!es",
      name = "h",
      descriptor = "Liga;"
   )
   private class91 field3486;
   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3494 = new String[]{method2163(method2162("sZf%4")), method2163(method2162("x\\$\b")), method2163(method2162("sZfXux@<Z4")), method2163(method2162("m\u0007fJa")), method2163(method2162("sZf 4")), method2163(method2162("sZf#4")), method2163(method2162("sZf\"4"))};
   @OriginalMember(
      owner = "client!es",
      name = "i",
      descriptor = "I"
   )
   public static int field3491 = 104;
   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "I"
   )
   public static int field3490;
   @OriginalMember(
      owner = "client!es",
      name = "f",
      descriptor = "I"
   )
   public static int field3492;
   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "I"
   )
   public static int field3493;
   @OriginalMember(
      owner = "client!es",
      name = "d",
      descriptor = "Lda;"
   )
   private class447 field3485;
   @OriginalMember(
      owner = "client!es",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field3487;

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method222(int arg0, boolean arg1) {
      try {
         if (arg1) {
            int var3 = this.field3486.field1240.method1893((byte)-49, this.field3486.field1227, class286.field3961) + this.field3486.field1226;
            int var4 = this.field3486.field1232.method4440(class627.field9254, -126, this.field3486.field1230) - -this.field3486.field1243;
            this.field3485.method3420(var3, 0, 11520, this.field3486.field1239, this.field3486.field1227, (class648[])null, this.field3486.field1224, 0, (int[])null, this.field3486.field1241, this.field3486.field1245, this.field3486.field1225, this.field3486.field1235, var4, (class87)null, this.field3486.field1230);
         }

         if (arg0 != -22493) {
            this.field3486 = null;
         }

         ++field3493;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3494[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method221(int arg0) {
      try {
         ++field3490;
         boolean var2 = true;
         if (!this.field3489.method2681((byte)106, this.field3486.field1237)) {
            var2 = false;
         }

         if (!this.field3488.method2681((byte)96, this.field3486.field1237)) {
            var2 = false;
         }

         return arg0 != -10439 ? false : var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3494[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method223(int arg0) {
      try {
         if (arg0 != -28722) {
            method2161(78);
         }

         ++field3492;
         class19 var2 = class481.method3655(this.field3488, 28, this.field3486.field1237);
         this.field3485 = class629.field9294.method430(var2, class65.method585(this.field3489, this.field3486.field1237), true);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3494[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2161(int arg0) {
      try {
         field3487 = null;
         if (arg0 != 104) {
            method2161(-50);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3494[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "<init>",
      descriptor = "(Lww;Lww;Liga;)V"
   )
   public class273(class339 arg0, class339 arg1, class91 arg2) {
      try {
         this.field3488 = arg1;
         this.field3489 = arg0;
         this.field3486 = arg2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3494[2] + (arg0 != null ? field3494[3] : field3494[1]) + ',' + (arg1 != null ? field3494[3] : field3494[1]) + ',' + (arg2 != null ? field3494[3] : field3494[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
