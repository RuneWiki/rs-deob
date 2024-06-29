import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class42 extends class246 {
   @OriginalMember(
      owner = "client!pja",
      name = "p",
      descriptor = "Z"
   )
   private boolean field965 = false;
   @OriginalMember(
      owner = "client!pja",
      name = "o",
      descriptor = "Z"
   )
   public boolean field964 = false;
   @OriginalMember(
      owner = "client!pja",
      name = "x",
      descriptor = "I"
   )
   public int field969 = 0;
   @OriginalMember(
      owner = "client!pja",
      name = "v",
      descriptor = "Lhc;"
   )
   private class150 field972 = new class150();
   @OriginalMember(
      owner = "client!pja",
      name = "m",
      descriptor = "I"
   )
   private int field974 = 0;
   @OriginalMember(
      owner = "client!pja",
      name = "w",
      descriptor = "Liw;"
   )
   public class332 field973 = new class332();
   @OriginalMember(
      owner = "client!pja",
      name = "j",
      descriptor = "I"
   )
   private int field975 = 0;
   @OriginalMember(
      owner = "client!pja",
      name = "s",
      descriptor = "Z"
   )
   private boolean field977 = false;
   @OriginalMember(
      owner = "client!pja",
      name = "u",
      descriptor = "Z"
   )
   public boolean field979 = false;
   @OriginalMember(
      owner = "client!pja",
      name = "y",
      descriptor = "Lvm;"
   )
   public class713 field976 = new class713();
   @OriginalMember(
      owner = "client!pja",
      name = "n",
      descriptor = "[Laja;"
   )
   public class99[] field967 = new class99[8192];
   @OriginalMember(
      owner = "client!pja",
      name = "k",
      descriptor = "[Z"
   )
   private static boolean[] field968 = new boolean[32];
   @OriginalMember(
      owner = "client!pja",
      name = "t",
      descriptor = "[Z"
   )
   private static boolean[] field971 = new boolean[8];
   @OriginalMember(
      owner = "client!pja",
      name = "l",
      descriptor = "I"
   )
   public int field978;
   @OriginalMember(
      owner = "client!pja",
      name = "r",
      descriptor = "J"
   )
   private long field966;
   @OriginalMember(
      owner = "client!pja",
      name = "q",
      descriptor = "J"
   )
   private long field970;

   @OriginalMember(
      owner = "client!pja",
      name = "d",
      descriptor = "()V",
      line = 4
   )
   public final void method486() {
      this.field964 = true;

      for(class217 var1 = (class217)this.field973.method2579(-801); var1 != null; var1 = (class217)this.field973.method2583(1)) {
         if (var1.field3284.field10519 == 1) {
            var1.method2385(117);
         }
      }

      for(int var2 = 0; var2 < this.field967.length; ++var2) {
         if (this.field967[var2] != null) {
            this.field967[var2].method956();
            this.field967[var2] = null;
         }
      }

      this.field969 = 0;
      this.field972 = new class150();
      this.field974 = 0;
      this.field973 = new class332();
      this.field975 = 0;
      this.method1995((byte)35);
      class401.field5896[class463.field6774] = this;
      class463.field6774 = class463.field6774 + 1 & class665.field9663[class231.field3395];
   }

   @OriginalMember(
      owner = "client!pja",
      name = "g",
      descriptor = "()V",
      line = 40
   )
   public final void method487() {
      this.field977 = true;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "f",
      descriptor = "()Lvm;",
      line = 43
   )
   public final class713 method488() {
      this.field976.field10342.method3163((byte)81);

      for(int var1 = 0; var1 < this.field967.length; ++var1) {
         if (this.field967[var1] != null && this.field967[var1].field1587 != null) {
            this.field976.field10342.method3165(this.field967[var1], -1);
         }
      }

      return this.field976;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(Lha;J)Z",
      line = 58
   )
   public final boolean method489(class65 arg0, long arg1) {
      if (this.field970 != this.field966) {
         this.method499();
      } else {
         this.method500();
      }

      if (arg1 - this.field970 > 750L) {
         this.method486();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field966);
         if (this.field977) {
            for(class190 var5 = (class190)this.field972.method1394((byte)-119); var5 != null; var5 = (class190)this.field972.method1400(false)) {
               for(int var6 = 0; var6 < var5.field2857.field7658; ++var6) {
                  var5.method1654(arg0, !this.field965, 1, (byte)-116, arg1);
               }
            }

            this.field977 = false;
         }

         for(class190 var7 = (class190)this.field972.method1394((byte)-122); var7 != null; var7 = (class190)this.field972.method1400(false)) {
            var7.method1654(arg0, !this.field965, var4, (byte)-111, arg1);
         }

         this.field966 = arg1;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(J)V",
      line = 107
   )
   public final void method490(long arg0) {
      this.field970 = arg0;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(Lha;J[Ltf;[Llu;Z)V",
      line = 110
   )
   public final void method491(class65 arg0, long arg1, class309[] arg2, class740[] arg3, boolean arg4) {
      if (!this.field964) {
         this.method494(arg0, arg2, arg4);
         this.method495(arg3, arg4);
         this.field970 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(IZ)Lpja;",
      line = 120
   )
   public static final class42 method492(int arg0, boolean arg1) {
      if (class76.field1338 != class463.field6774) {
         class42 var2 = class401.field5896[class76.field1338];
         class76.field1338 = class76.field1338 + 1 & class665.field9663[class231.field3395];
         var2.method498(arg0, arg1);
         return var2;
      } else {
         return new class42(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "()Lvm;",
      line = 133
   )
   public final class713 method493() {
      return this.field976;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(Lha;[Ltf;Z)V",
      line = 138
   )
   private final void method494(class65 arg0, class309[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field968[var4] = false;
      }

      label67:
      for(class190 var5 = (class190)this.field972.method1394((byte)-116); var5 != null; var5 = (class190)this.field972.method1400(false)) {
         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length; ++var8) {
               if (arg1[var8] == var5.field2858 || arg1[var8].field4443 == var5.field2858) {
                  field968[var8] = true;
                  var5.method1658(0);
                  var5.field2861 = false;
                  continue label67;
               }
            }
         }

         if (!arg2) {
            if (var5.field2849 == 0) {
               var5.method1995((byte)35);
               --this.field974;
            } else {
               var5.field2861 = true;
            }
         }
      }

      if (arg1 != null) {
         for(int var6 = 0; var6 < arg1.length && var6 != 32 && this.field974 != 32; ++var6) {
            if (!field968[var6]) {
               class190 var7 = new class190(arg0, arg1[var6], this, this.field970);
               this.field972.method1398(true, var7);
               ++this.field974;
               field968[var6] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!pja",
      name = "<init>",
      descriptor = "(IZ)V",
      line = 394
   )
   private class42(int arg0, boolean arg1) {
      this.method498(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "([Llu;Z)V",
      line = 222
   )
   private final void method495(class740[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field971[var3] = false;
      }

      label76:
      for(class217 var4 = (class217)this.field973.method2579(-801); var4 != null; var4 = (class217)this.field973.method2583(1)) {
         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length; ++var7) {
               if (arg0[var7] == var4.field3286 || arg0[var7].field10656 == var4.field3286) {
                  field971[var7] = true;
                  var4.method1846(true);
                  continue label76;
               }
            }
         }

         if (!arg1) {
            var4.method154(43);
            --this.field975;
            if (var4.method2389(-126)) {
               var4.method2385(117);
               --class234.field3412;
            }
         }
      }

      if (arg0 != null) {
         for(int var5 = 0; var5 < arg0.length && var5 != 8 && this.field975 != 8; ++var5) {
            if (!field971[var5]) {
               class217 var6 = null;
               if (arg0[var5].method5334((byte)-126).field10519 == 1 && class234.field3412 < 32) {
                  var6 = new class217(arg0[var5], this);
                  class69.field1241.method2924((byte)46, (long)arg0[var5].field10659, var6);
                  ++class234.field3412;
               }

               if (var6 == null) {
                  var6 = new class217(arg0[var5], this);
               }

               this.field973.method2585(var6, -72);
               ++this.field975;
               field971[var5] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(Lha;)V",
      line = 310
   )
   public final void method496(class65 arg0) {
      this.field976.field10342.method3163((byte)81);

      for(class190 var2 = (class190)this.field972.method1394((byte)-128); var2 != null; var2 = (class190)this.field972.method1400(false)) {
         var2.method1653(this.field966, true, arg0);
      }

   }

   @OriginalMember(
      owner = "client!pja",
      name = "c",
      descriptor = "()V",
      line = 322
   )
   public static void method497() {
      field968 = null;
      field971 = null;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "b",
      descriptor = "(IZ)V",
      line = 327
   )
   private final void method498(int arg0, boolean arg1) {
      class513.field7485.method1398(true, this);
      this.field970 = (long)arg0;
      this.field966 = (long)arg0;
      this.field977 = true;
      this.field979 = arg1;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "e",
      descriptor = "()V",
      line = 335
   )
   public final void method499() {
      this.field965 = true;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "b",
      descriptor = "()V",
      line = 338
   )
   private final void method500() {
      this.field965 = false;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(IIIII)V",
      line = 349
   )
   public final void method501(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field978 = arg0;
   }
}
