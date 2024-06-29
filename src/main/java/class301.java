import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class301 {
   @OriginalMember(
      owner = "client!cu",
      name = "k",
      descriptor = "I"
   )
   private int field4195;
   @OriginalMember(
      owner = "client!cu",
      name = "h",
      descriptor = "I"
   )
   private int field4200;
   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "Z"
   )
   private boolean field4198;
   @OriginalMember(
      owner = "client!cu",
      name = "f",
      descriptor = "Z"
   )
   private boolean field4196;
   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4201 = new String[]{method2423(method2422("\u0015v\u0019\u001bq")), method2423(method2422("\u0015v\u0019\u001fq")), method2423(method2422("\u0015v\u0019\u001eq")), method2423(method2422("\u0015v\u0019\u001cq")), method2423(method2422("\u0015v\u0019d0\u0018jCfq")), method2423(method2422("\u0015v\u0019\u0019q")), method2423(method2422("\u0015v\u0019\u001aq")), method2423(method2422("\u0015v\u0019\u001dq"))};
   @OriginalMember(
      owner = "client!cu",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field4194 = new float[16384];
   @OriginalMember(
      owner = "client!cu",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field4191 = new float[16384];
   @OriginalMember(
      owner = "client!cu",
      name = "j",
      descriptor = "I"
   )
   public static int field4189;
   @OriginalMember(
      owner = "client!cu",
      name = "e",
      descriptor = "I"
   )
   public static int field4190;
   @OriginalMember(
      owner = "client!cu",
      name = "i",
      descriptor = "I"
   )
   public static int field4192;
   @OriginalMember(
      owner = "client!cu",
      name = "g",
      descriptor = "I"
   )
   public static int field4193;
   @OriginalMember(
      owner = "client!cu",
      name = "b",
      descriptor = "I"
   )
   public static int field4197;
   @OriginalMember(
      owner = "client!cu",
      name = "l",
      descriptor = "I"
   )
   public static int field4199;

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method2415(boolean arg0) {
      try {
         ++field4190;
         if (arg0) {
            field4191 = null;
         }

         return this.field4198;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4201[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2416(int arg0) {
      try {
         field4194 = null;
         if (arg0 == 16384) {
            field4191 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4201[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(III)B"
   )
   public static final byte method2417(int arg0, int arg1, int arg2) {
      try {
         ++field4197;
         if (~arg2 != -10) {
            return 0;
         } else {
            if (arg0 != 0) {
               field4191 = null;
            }

            return (byte)(~(1 & arg1) != -1 ? 2 : 1);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4201[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2418(byte arg0) {
      try {
         ++field4193;
         if (arg0 != -82) {
            this.field4198 = false;
         }

         return this.field4196;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4201[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2419(int arg0) {
      try {
         if (arg0 != -1) {
            field4191 = null;
         }

         ++field4189;
         return this.field4200;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4201[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method2420(boolean arg0, int arg1) {
      try {
         class37.field522.method874(class497.field6954.method484());
         ++field4192;
         int[] var2 = class497.field6954.method419();
         class792.field11592 = var2[0];
         class410.field5647 = var2[1];
         class543.field7941 = var2[2];
         if (arg1 != 19934) {
            field4191 = null;
         }

         class113.field1506 = var2[3];
         if (!arg0) {
            class497.field6954.method504(class582.field8599, class490.field6847, class345.field4733, class467.field6419);
            class81.method786(class355.field4954, 0);
         } else {
            class497.field6954.method504(class430.field5849, class385.field5331, class408.field5630, class778.field11339);
            class81.method786(class708.field10404, 0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4201[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2421(byte arg0) {
      try {
         ++field4199;
         if (arg0 <= 76) {
            this.method2418((byte)-52);
         }

         return this.field4195;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4201[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "<init>",
      descriptor = "(ZIIZ)V"
   )
   public class301(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field4195 = arg2;
         this.field4200 = arg1;
         this.field4198 = arg3;
         this.field4196 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4201[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field4194[var2] = (float)Math.sin((double)var2 * var0);
         field4191[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2422(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2423(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
