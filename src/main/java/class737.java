import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class737 extends class604 {
   @OriginalMember(
      owner = "client!ge",
      name = "p",
      descriptor = "Z"
   )
   public boolean field10938 = false;
   @OriginalMember(
      owner = "client!ge",
      name = "j",
      descriptor = "Z"
   )
   private boolean field10939 = false;
   @OriginalMember(
      owner = "client!ge",
      name = "q",
      descriptor = "I"
   )
   public int field10944 = 0;
   @OriginalMember(
      owner = "client!ge",
      name = "m",
      descriptor = "Lma;"
   )
   private class14 field10945 = new class14();
   @OriginalMember(
      owner = "client!ge",
      name = "i",
      descriptor = "I"
   )
   private int field10946 = 0;
   @OriginalMember(
      owner = "client!ge",
      name = "k",
      descriptor = "Lum;"
   )
   public class550 field10947 = new class550();
   @OriginalMember(
      owner = "client!ge",
      name = "x",
      descriptor = "Z"
   )
   public boolean field10948 = false;
   @OriginalMember(
      owner = "client!ge",
      name = "v",
      descriptor = "Z"
   )
   private boolean field10951 = false;
   @OriginalMember(
      owner = "client!ge",
      name = "t",
      descriptor = "I"
   )
   private int field10952 = 0;
   @OriginalMember(
      owner = "client!ge",
      name = "l",
      descriptor = "Loda;"
   )
   public class127 field10949 = new class127();
   @OriginalMember(
      owner = "client!ge",
      name = "u",
      descriptor = "[Lah;"
   )
   public class404[] field10941 = new class404[8192];
   @OriginalMember(
      owner = "client!ge",
      name = "o",
      descriptor = "[Z"
   )
   private static boolean[] field10940 = new boolean[32];
   @OriginalMember(
      owner = "client!ge",
      name = "r",
      descriptor = "[Z"
   )
   private static boolean[] field10943 = new boolean[8];
   @OriginalMember(
      owner = "client!ge",
      name = "n",
      descriptor = "I"
   )
   public int field10950;
   @OriginalMember(
      owner = "client!ge",
      name = "s",
      descriptor = "J"
   )
   private long field10937;
   @OriginalMember(
      owner = "client!ge",
      name = "w",
      descriptor = "J"
   )
   private long field10942;

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Lha;)V",
      line = 4
   )
   public final void method5358(class66 arg0) {
      this.field10949.field1524.method394(1945546785);

      for(class238 var2 = (class238)this.field10945.method102(19230); var2 != null; var2 = (class238)this.field10945.method95((byte)127)) {
         var2.method1773(this.field10937, 106, arg0);
      }

   }

   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "(IZ)Lge;",
      line = 19
   )
   public static final class737 method5359(int arg0, boolean arg1) {
      if (class621.field9053 != class497.field7371) {
         class737 var2 = class659.field9557[class621.field9053];
         class621.field9053 = class621.field9053 + 1 & class124.field1513[class467.field7001];
         var2.method5361(arg0, arg1);
         return var2;
      } else {
         return new class737(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Lha;J[Lria;[Lhka;Z)V",
      line = 32
   )
   public final void method5360(class66 arg0, long arg1, class299[] arg2, class57[] arg3, boolean arg4) {
      if (!this.field10938) {
         this.method5373(arg0, arg2, arg4);
         this.method5372(arg3, arg4);
         this.field10942 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(IZ)V",
      line = 40
   )
   private final void method5361(int arg0, boolean arg1) {
      class425.field6457.method100(this, 1);
      this.field10942 = (long)arg0;
      this.field10937 = (long)arg0;
      this.field10951 = true;
      this.field10948 = arg1;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Lha;J)Z",
      line = 49
   )
   public final boolean method5362(class66 arg0, long arg1) {
      if (this.field10942 != this.field10937) {
         this.method5364();
      } else {
         this.method5367();
      }

      if (arg1 - this.field10942 > 750L) {
         this.method5370();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field10937);
         if (this.field10951) {
            for(class238 var5 = (class238)this.field10945.method102(19230); var5 != null; var5 = (class238)this.field10945.method95((byte)97)) {
               for(int var6 = 0; var6 < var5.field3015.field5242; ++var6) {
                  var5.method1774(1, !this.field10939, arg0, 1, arg1);
               }
            }

            this.field10951 = false;
         }

         for(class238 var7 = (class238)this.field10945.method102(19230); var7 != null; var7 = (class238)this.field10945.method95((byte)110)) {
            var7.method1774(var4, !this.field10939, arg0, 1, arg1);
         }

         this.field10937 = arg1;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(J)V",
      line = 97
   )
   public final void method5363(long arg0) {
      this.field10942 = arg0;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "e",
      descriptor = "()V",
      line = 100
   )
   public final void method5364() {
      this.field10939 = true;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(IIIII)V",
      line = 104
   )
   public final void method5365(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field10950 = arg0;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "()Loda;",
      line = 115
   )
   public final class127 method5366() {
      this.field10949.field1524.method394(1945546785);

      for(int var1 = 0; var1 < this.field10941.length; ++var1) {
         if (this.field10941[var1] != null && this.field10941[var1].field6201 != null) {
            this.field10949.field1524.method395(-25224, this.field10941[var1]);
         }
      }

      return this.field10949;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "g",
      descriptor = "()V",
      line = 130
   )
   private final void method5367() {
      this.field10939 = false;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "<init>",
      descriptor = "(IZ)V",
      line = 394
   )
   private class737(int arg0, boolean arg1) {
      this.method5361(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ge",
      name = "c",
      descriptor = "()Loda;",
      line = 136
   )
   public final class127 method5368() {
      return this.field10949;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "()V",
      line = 139
   )
   public static void method5369() {
      field10940 = null;
      field10943 = null;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "d",
      descriptor = "()V",
      line = 147
   )
   public final void method5370() {
      this.field10938 = true;

      for(class350 var1 = (class350)this.field10947.method4071((byte)127); var1 != null; var1 = (class350)this.field10947.method4059((byte)-71)) {
         if (var1.field5312.field2890 == 1) {
            var1.method699(12);
         }
      }

      for(int var2 = 0; var2 < this.field10941.length; ++var2) {
         if (this.field10941[var2] != null) {
            this.field10941[var2].method3105();
            this.field10941[var2] = null;
         }
      }

      this.field10944 = 0;
      this.field10945 = new class14();
      this.field10946 = 0;
      this.field10947 = new class550();
      this.field10952 = 0;
      this.method4413((byte)103);
      class659.field9557[class497.field7371] = this;
      class497.field7371 = class497.field7371 + 1 & class124.field1513[class467.field7001];
   }

   @OriginalMember(
      owner = "client!ge",
      name = "f",
      descriptor = "()V",
      line = 186
   )
   public final void method5371() {
      this.field10951 = true;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "([Lhka;Z)V",
      line = 191
   )
   private final void method5372(class57[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field10943[var3] = false;
      }

      label76:
      for(class350 var4 = (class350)this.field10947.method4071((byte)127); var4 != null; var4 = (class350)this.field10947.method4059((byte)111)) {
         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length; ++var7) {
               if (arg0[var7] == var4.field5306 || arg0[var7].field719 == var4.field5306) {
                  field10943[var7] = true;
                  var4.method2736(1);
                  continue label76;
               }
            }
         }

         if (!arg1) {
            var4.method2720(0);
            --this.field10952;
            if (var4.method697(16885)) {
               var4.method699(12);
               --class726.field10788;
            }
         }
      }

      if (arg0 != null) {
         for(int var5 = 0; var5 < arg0.length && var5 != 8 && this.field10952 != 8; ++var5) {
            if (!field10943[var5]) {
               class350 var6 = null;
               if (arg0[var5].method474(-26464).field2890 == 1 && class726.field10788 < 32) {
                  var6 = new class350(arg0[var5], this);
                  class441.field6719.method1369(true, var6, (long)arg0[var5].field710);
                  ++class726.field10788;
               }

               if (var6 == null) {
                  var6 = new class350(arg0[var5], this);
               }

               this.field10947.method4060(23, var6);
               ++this.field10952;
               field10943[var5] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Lha;[Lria;Z)V",
      line = 281
   )
   private final void method5373(class66 arg0, class299[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field10940[var4] = false;
      }

      label67:
      for(class238 var5 = (class238)this.field10945.method102(19230); var5 != null; var5 = (class238)this.field10945.method95((byte)110)) {
         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length; ++var8) {
               if (arg1[var8] == var5.field3011 || arg1[var8].field4261 == var5.field3011) {
                  field10940[var8] = true;
                  var5.method1777((byte)120);
                  var5.field3012 = false;
                  continue label67;
               }
            }
         }

         if (!arg2) {
            if (var5.field3017 == 0) {
               var5.method4413((byte)29);
               --this.field10946;
            } else {
               var5.field3012 = true;
            }
         }
      }

      if (arg1 != null) {
         for(int var6 = 0; var6 < arg1.length && var6 != 32 && this.field10946 != 32; ++var6) {
            if (!field10940[var6]) {
               class238 var7 = new class238(arg0, arg1[var6], this, this.field10942);
               this.field10945.method100(var7, 1);
               ++this.field10946;
               field10940[var6] = true;
            }
         }
      }

   }
}
