import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class549 extends class141 {
   @OriginalMember(
      owner = "client!cb",
      name = "t",
      descriptor = "F"
   )
   private float field7862 = 0.0F;
   @OriginalMember(
      owner = "client!cb",
      name = "v",
      descriptor = "Laq;"
   )
   private class172 field7861;
   @OriginalMember(
      owner = "client!cb",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7867 = new String[]{method3938(method3937("4mM\te")), method3938(method3937("4mM\u000be")), method3938(method3937("4mM\fe")), method3938(method3937("4mM\re")), method3938(method3937("4mM\u0007e")), method3938(method3937("4mM\u0001e")), method3938(method3937("4mM\u000fe")), method3938(method3937("9z\u000f$")), method3938(method3937(",!Mf0")), method3938(method3937("4mMt$9f\u0017ve")), method3938(method3937("4mM\ne")), method3938(method3937("4mM\u000ee"))};
   @OriginalMember(
      owner = "client!cb",
      name = "p",
      descriptor = "Lek;"
   )
   public static class536 field7859 = new class536(54, 12);
   @OriginalMember(
      owner = "client!cb",
      name = "y",
      descriptor = "I"
   )
   public static int field7853;
   @OriginalMember(
      owner = "client!cb",
      name = "u",
      descriptor = "I"
   )
   public static int field7854;
   @OriginalMember(
      owner = "client!cb",
      name = "q",
      descriptor = "I"
   )
   public static int field7855;
   @OriginalMember(
      owner = "client!cb",
      name = "w",
      descriptor = "I"
   )
   public static int field7856;
   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "I"
   )
   public static int field7857;
   @OriginalMember(
      owner = "client!cb",
      name = "n",
      descriptor = "I"
   )
   public static int field7858;
   @OriginalMember(
      owner = "client!cb",
      name = "s",
      descriptor = "I"
   )
   public static int field7860;
   @OriginalMember(
      owner = "client!cb",
      name = "x",
      descriptor = "I"
   )
   public static int field7863;
   @OriginalMember(
      owner = "client!cb",
      name = "o",
      descriptor = "I"
   )
   public static int field7864;
   @OriginalMember(
      owner = "client!cb",
      name = "r",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field7865;
   @OriginalMember(
      owner = "client!cb",
      name = "m",
      descriptor = "[Lqu;"
   )
   public static class106[] field7866;

   @OriginalMember(
      owner = "client!cb",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method308(byte arg0) {
      try {
         if (super.field1801.method2766(127) == 0) {
            class716 var2 = super.field1801.method2780(-102);
            super.field1801.method2763(1, -49);
            class716 var3 = super.field1801.method2821((byte)39);
            var3.method1230(var2);
            var3.method5209(0.125F, 0.125F, 1.0F, true);
            var3.method5198(this.field7862, 0.0F, 0.0F, (byte)-76);
            super.field1801.method2778((byte)-126, class505.field7325);
            super.field1801.method2763(0, -90);
         }

         if (arg0 != 86) {
            this.method311(false, true);
         }

         ++field7855;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7867[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method317(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label37: {
            super.field1801.method2763(1, -67);
            ++field7856;
            if (~(arg2 & 128) == -1) {
               if (~(1 & arg1) == -2) {
                  if (!this.field7861.field2393) {
                     int var5 = super.field1801.field5301 % 4000 * 16 / 4000;
                     super.field1801.method2804(this.field7861.field2397[var5], -2);
                     if (!var4) {
                        break label37;
                     }
                  }

                  this.field7862 = (float)(super.field1801.field5301 % 4000) / 4000.0F;
                  super.field1801.method2804(this.field7861.field2387, -2);
                  if (!var4) {
                     break label37;
                  }
               }

               if (!this.field7861.field2393) {
                  super.field1801.method2804(this.field7861.field2397[0], arg0 ^ -2);
                  if (!var4) {
                     break label37;
                  }
               }

               super.field1801.method2804(this.field7861.field2387, -2);
               if (!var4) {
                  break label37;
               }
            }

            super.field1801.method2804((class205)null, -2);
         }

         super.field1801.method2763(arg0, -66);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7867[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method313(boolean arg0) {
      try {
         ++field7858;
         if (!arg0) {
            field7866 = null;
         }

         return this.field7861.method1401(-61);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7867[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(Lm;II)V"
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         ++field7860;
         super.field1801.method2804(arg0, arg2 ^ -2);
         if (arg2 != 0) {
            field7866 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7867[10] + (arg0 != null ? field7867[8] : field7867[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "h",
      descriptor = "(B)V"
   )
   public static void method3935(byte arg0) {
      try {
         field7865 = null;
         field7859 = null;
         if (arg0 != -105) {
            method3936(52, (class266)null);
         }

         field7866 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7867[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method307(byte arg0) {
      try {
         ++field7857;
         super.field1801.method2763(1, -77);
         super.field1801.method2745(-30, class458.field6587, class458.field6587);
         super.field1801.method2814(0, class10.field93, true);
         if (arg0 <= 102) {
            field7864 = -124;
         }

         super.field1801.method2787(class10.field93, (byte)-51, 0);
         super.field1801.method2582((byte)-34, 1);
         super.field1801.method2804((class205)null, -2);
         super.field1801.method2763(0, -91);
         super.field1801.method2787(class10.field93, (byte)-51, 0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7867[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(ILkf;)V"
   )
   public static final void method3936(int arg0, class266 arg1) {
      try {
         ++field7863;
         class599.field8806 = arg1;
         if (arg0 != 4000) {
            method3936(-126, (class266)null);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7867[11] + arg0 + ',' + (arg1 != null ? field7867[8] : field7867[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "<init>",
      descriptor = "(Lsc;Laq;)V"
   )
   public class549(class369 arg0, class172 arg1) {
      super(arg0);

      try {
         this.field7861 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7867[9] + (arg0 != null ? field7867[8] : field7867[7]) + ',' + (arg1 != null ? field7867[8] : field7867[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            this.field7861 = null;
         }

         ++field7853;
         super.field1801.method2745(-30, class458.field6587, class603.field8872);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7867[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method309(boolean arg0, boolean arg1) {
      try {
         ++field7854;
         super.field1801.method2763(1, -61);
         super.field1801.method2745(-30, class358.field4889, class603.field8872);
         super.field1801.method2635(class10.field93, 0, -126, true, arg0);
         super.field1801.method2787(class706.field10312, (byte)-51, 0);
         super.field1801.method2582((byte)-84, 0);
         super.field1801.method2763(0, -84);
         super.field1801.method2752(-16777216, (byte)50);
         super.field1801.method2787(class304.field4150, (byte)-51, 0);
         this.method308((byte)86);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7867[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3937(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3938(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
