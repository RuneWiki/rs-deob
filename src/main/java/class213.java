import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class213 extends class171 {
   @OriginalMember(
      owner = "client!qo",
      name = "t",
      descriptor = "J"
   )
   private long field2703 = -1L;
   @OriginalMember(
      owner = "client!qo",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   private String field2715 = null;
   @OriginalMember(
      owner = "client!qo",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2716 = new String[]{method1747(method1746("\u0000pgT\u001b")), method1747(method1746("\u0000pgW\u001b")), method1747(method1746("\u001fj%y")), method1747(method1746("\u0000pgQ\u001b")), method1747(method1746("\n1g;N")), method1747(method1746("\u001cz$wV\u0003w(f[K")), method1747(method1746("Qr,xQ\u0014m't^\u0014%")), method1747(method1746("\u0000pgV\u001b"))};
   @OriginalMember(
      owner = "client!qo",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field2709 = new int[]{104, 120, 136, 168};
   @OriginalMember(
      owner = "client!qo",
      name = "v",
      descriptor = "I"
   )
   public static int field2712 = 0;
   @OriginalMember(
      owner = "client!qo",
      name = "w",
      descriptor = "B"
   )
   private byte field2711;
   @OriginalMember(
      owner = "client!qo",
      name = "u",
      descriptor = "F"
   )
   public static float field2710;
   @OriginalMember(
      owner = "client!qo",
      name = "A",
      descriptor = "I"
   )
   public static int field2704;
   @OriginalMember(
      owner = "client!qo",
      name = "q",
      descriptor = "I"
   )
   public static int field2707;
   @OriginalMember(
      owner = "client!qo",
      name = "s",
      descriptor = "I"
   )
   public static int field2708;
   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "I"
   )
   private int field2713;
   @OriginalMember(
      owner = "client!qo",
      name = "x",
      descriptor = "I"
   )
   public static int field2714;
   @OriginalMember(
      owner = "client!qo",
      name = "y",
      descriptor = "Lwf;"
   )
   public static class541 field2705;
   @OriginalMember(
      owner = "client!qo",
      name = "r",
      descriptor = "Lfu;"
   )
   public static class80 field2706;

   @OriginalMember(
      owner = "client!qo",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1744(int arg0) {
      try {
         class113.field1503 = null;
         if (arg0 == 136) {
            ++field2714;
            class92.field1247 = null;
            class288.field3983 = false;
            class714.field10494 = null;
            class366.field5089 = null;
            class86.field1180 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2716[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(Lfu;I)V"
   )
   public final void method1106(class80 arg0, int arg1) {
      try {
         if (arg1 == -3244) {
            ++field2708;
            class98 var3 = new class98();
            var3.field1298 = this.field2711;
            var3.field1307 = this.field2713;
            var3.field1299 = this.field2715;
            arg0.method776((byte)-21, var3);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2716[7] + (arg0 != null ? field2716[4] : field2716[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(Lgea;B)V"
   )
   public final void method1104(class66 arg0, byte arg1) {
      try {
         ++field2704;
         if (~arg0.method640(255) != -256) {
            --arg0.field864;
            this.field2703 = arg0.method660(arg1 + 232);
         }

         this.field2715 = arg0.method654((byte)-118);
         this.field2713 = arg0.method603(arg1 ^ 111);
         this.field2711 = arg0.method628((byte)-12);
         arg0.method660(111);
         if (class522.field7327) {
            System.out.println(field2716[5] + this.field2703 + field2716[6] + this.field2715);
         }

         if (arg1 != -111) {
            method1745(52);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2716[3] + (arg0 != null ? field2716[4] : field2716[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1745(int arg0) {
      try {
         field2709 = null;
         field2706 = null;
         field2705 = null;
         if (arg0 != 255) {
            field2712 = -75;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2716[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1746(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1747(char[] arg0) {
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
            var10005 = 31;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
