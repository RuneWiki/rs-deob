import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class696 {
   @OriginalMember(
      owner = "client!aga",
      name = "e",
      descriptor = "Lsga;"
   )
   private class76 field10211 = new class76();
   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "Luda;"
   )
   private class478 field10215 = new class478();
   @OriginalMember(
      owner = "client!aga",
      name = "j",
      descriptor = "I"
   )
   private int field10216;
   @OriginalMember(
      owner = "client!aga",
      name = "i",
      descriptor = "I"
   )
   private int field10214;
   @OriginalMember(
      owner = "client!aga",
      name = "f",
      descriptor = "Lwv;"
   )
   private class37 field10213;
   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10217 = new String[]{method5071(method5070("\rrvfrD")), method5071(method5070("\rrvfwD")), method5071(method5070("\u0017;9fN")), method5071(method5070("\rrvfpD")), method5071(method5070("\u0002`{$")), method5071(method5070("\rrvfqD")), method5071(method5070("\rrvf\u000f\u0005{~<\rD"))};
   @OriginalMember(
      owner = "client!aga",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field10207 = true;
   @OriginalMember(
      owner = "client!aga",
      name = "d",
      descriptor = "I"
   )
   public static int field10208;
   @OriginalMember(
      owner = "client!aga",
      name = "h",
      descriptor = "I"
   )
   public static int field10209;
   @OriginalMember(
      owner = "client!aga",
      name = "g",
      descriptor = "I"
   )
   public static int field10210;
   @OriginalMember(
      owner = "client!aga",
      name = "b",
      descriptor = "I"
   )
   public static int field10212;

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(JB)V",
      line = 10
   )
   public final void method5066(long arg0, byte arg1) {
      try {
         ++field10208;
         int var4 = -98 % ((arg1 - -27) / 57);
         class76 var5 = (class76)this.field10213.method329((byte)107, arg0);
         if (var5 != null) {
            var5.method3165(127);
            var5.method693((byte)-121);
            ++this.field10214;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10217[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(I)V",
      line = 45
   )
   public final void method5067(int arg0) {
      try {
         ++field10212;
         this.field10215.method3490(arg0 + -1413226608);
         if (arg0 == -12072) {
            this.field10213.method334((byte)109);
            this.field10211 = new class76();
            this.field10214 = this.field10216;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10217[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(JLsga;I)V",
      line = 59
   )
   public final void method5068(long arg0, class76 arg1, int arg2) {
      try {
         label29: {
            if (~this.field10214 != -1) {
               --this.field10214;
               if (!client.field4360) {
                  break label29;
               }
            }

            class76 var5 = this.field10215.method3487(-96);
            var5.method3165(109);
            var5.method693((byte)-96);
            if (this.field10211 == var5) {
               class76 var6 = this.field10215.method3487(112);
               var6.method3165(115);
               var6.method693((byte)-16);
            }
         }

         ++field10209;
         this.field10213.method336(-1, arg0, arg1);
         if (arg2 > -26) {
            this.method5066(-74L, (byte)27);
         }

         this.field10215.method3486(arg1, 1779380172);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10217[3] + arg0 + ',' + (arg1 != null ? field10217[2] : field10217[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(BJ)Lsga;",
      line = 90
   )
   public final class76 method5069(byte arg0, long arg1) {
      try {
         ++field10210;
         class76 var4 = (class76)this.field10213.method329((byte)114, arg1);
         if (arg0 > -75) {
            return null;
         } else {
            if (var4 != null) {
               this.field10215.method3486(var4, 1779380172);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10217[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "<init>",
      descriptor = "(I)V",
      line = 124
   )
   public class696(int arg0) {
      try {
         this.field10216 = arg0;
         this.field10214 = arg0;

         int var2;
         for(var2 = 1; arg0 > var2 + var2; var2 += var2) {
         }

         this.field10213 = new class37(var2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10217[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5070(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5071(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
