import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class260 {
   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3617 = new String[]{method1998(method1997("\\T\u0019-=\u0017")), method1998(method1997("QB\u0014o")), method1998(method1997("D\u0019V-\u0001")), method1998(method1997("\\T\u0019->\u0017")), method1998(method1997("\\T\u0019-?\u0017"))};
   @OriginalMember(
      owner = "client!cca",
      name = "e",
      descriptor = "I"
   )
   public static int field3609 = 0;
   @OriginalMember(
      owner = "client!cca",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field3616 = new int[25];
   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "I"
   )
   public int field3610;
   @OriginalMember(
      owner = "client!cca",
      name = "f",
      descriptor = "I"
   )
   public static int field3611;
   @OriginalMember(
      owner = "client!cca",
      name = "d",
      descriptor = "I"
   )
   public static int field3612;
   @OriginalMember(
      owner = "client!cca",
      name = "h",
      descriptor = "I"
   )
   public static int field3613;
   @OriginalMember(
      owner = "client!cca",
      name = "c",
      descriptor = "I"
   )
   public int field3614;
   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "I"
   )
   public int field3615;

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1994(boolean arg0) {
      try {
         if (arg0) {
            field3609 = -16;
         }

         field3616 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3617[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method1995(class147 arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = 66 % ((arg1 - 38) / 51);

         while(true) {
            int var5 = arg0.method1143(-15465);
            if (var5 != 0) {
               this.method1996(arg0, 31800, var5);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field3613;
            break;
         }

      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3617[3] + (arg0 != null ? field3617[2] : field3617[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(Lwf;II)V"
   )
   private final void method1996(class147 arg0, int arg1, int arg2) {
      try {
         if (arg2 == 1) {
            this.field3610 = arg0.method1211(-26166);
            this.field3615 = arg0.method1143(-15465);
            this.field3614 = arg0.method1143(-15465);
         }

         ++field3612;
         if (arg1 != 31800) {
            this.field3615 = -119;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3617[4] + (arg0 != null ? field3617[2] : field3617[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1997(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1998(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
