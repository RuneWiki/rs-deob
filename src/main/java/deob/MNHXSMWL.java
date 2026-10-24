package deob;

@ObfuscatedName("MNHXSMWL")
public class MNHXSMWL {

	@ObfuscatedName("MNHXSMWL.i")
	public int field789 = 0;

	@ObfuscatedName("MNHXSMWL.j")
	public int field790 = 0;

	@ObfuscatedName("MNHXSMWL.k")
	public int field791;

	@ObfuscatedName("MNHXSMWL.l")
	public int field792;

	@ObfuscatedName("MNHXSMWL.m")
	public int[][] field793;

	public MNHXSMWL(int arg0, int arg1) {
		field791 = arg1;
		field792 = arg0;
		field793 = new int[field791][field792];
		method268();
	}

	@ObfuscatedName("MNHXSMWL.a()V")
	public void method268() {
		for (int var1 = 0; var1 < field791; var1++) {
			for (int var2 = 0; var2 < field792; var2++) {
				if (var1 == 0 || var2 == 0 || field791 - 1 == var1 || field792 - 1 == var2) {
					field793[var1][var2] = 0xFFFFFF;
				} else {
					field793[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("MNHXSMWL.a(IIIIIZ)V")
	public void method269(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field789;
		arg0 -= field790;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method272(arg3, arg0, 128);
				method272(arg3 - 1, arg0, 8);
			}

			if (arg2 == 1) {
				method272(arg3, arg0, 2);
				method272(arg3, arg0 + 1, 32);
			}

			if (arg2 == 2) {
				method272(arg3, arg0, 8);
				method272(arg3 + 1, arg0, 128);
			}

			if (arg2 == 3) {
				method272(arg3, arg0, 32);
				method272(arg3, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method272(arg3, arg0, 1);
				method272(arg3 - 1, arg0 + 1, 16);
			}

			if (arg2 == 1) {
				method272(arg3, arg0, 4);
				method272(arg3 + 1, arg0 + 1, 64);
			}

			if (arg2 == 2) {
				method272(arg3, arg0, 16);
				method272(arg3 + 1, arg0 - 1, 1);
			}

			if (arg2 == 3) {
				method272(arg3, arg0, 64);
				method272(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method272(arg3, arg0, 130);
				method272(arg3 - 1, arg0, 8);
				method272(arg3, arg0 + 1, 32);
			}

			if (arg2 == 1) {
				method272(arg3, arg0, 10);
				method272(arg3, arg0 + 1, 32);
				method272(arg3 + 1, arg0, 128);
			}

			if (arg2 == 2) {
				method272(arg3, arg0, 40);
				method272(arg3 + 1, arg0, 128);
				method272(arg3, arg0 - 1, 2);
			}

			if (arg2 == 3) {
				method272(arg3, arg0, 160);
				method272(arg3, arg0 - 1, 2);
				method272(arg3 - 1, arg0, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method272(arg3, arg0, 0x10000);
					method272(arg3 - 1, arg0, 4096);
				}

				if (arg2 == 1) {
					method272(arg3, arg0, 1024);
					method272(arg3, arg0 + 1, 16384);
				}

				if (arg2 == 2) {
					method272(arg3, arg0, 4096);
					method272(arg3 + 1, arg0, 0x10000);
				}

				if (arg2 == 3) {
					method272(arg3, arg0, 16384);
					method272(arg3, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method272(arg3, arg0, 512);
					method272(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg2 == 1) {
					method272(arg3, arg0, 2048);
					method272(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg2 == 2) {
					method272(arg3, arg0, 8192);
					method272(arg3 + 1, arg0 - 1, 512);
				}

				if (arg2 == 3) {
					method272(arg3, arg0, 32768);
					method272(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method272(arg3, arg0, 66560);
					method272(arg3 - 1, arg0, 4096);
					method272(arg3, arg0 + 1, 16384);
				}

				if (arg2 == 1) {
					method272(arg3, arg0, 5120);
					method272(arg3, arg0 + 1, 16384);
					method272(arg3 + 1, arg0, 0x10000);
				}

				if (arg2 == 2) {
					method272(arg3, arg0, 20480);
					method272(arg3 + 1, arg0, 0x10000);
					method272(arg3, arg0 - 1, 1024);
				}

				if (arg2 == 3) {
					method272(arg3, arg0, 81920);
					method272(arg3, arg0 - 1, 1024);
					method272(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("MNHXSMWL.a(IIIZIII)V")
	public void method270(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg5 -= field789;
		arg1 -= field790;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg5; var9 < arg0 + arg5; var9++) {
			if (var9 >= 0 && var9 < field791) {
				for (int var10 = arg1; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field792) {
						method272(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("MNHXSMWL.a(III)V")
	public void method271(int arg0, int arg1) {
		arg1 -= field789;
		arg0 -= field790;
		field793[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("MNHXSMWL.b(III)V")
	public void method272(int arg0, int arg1, int arg2) {
		field793[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("MNHXSMWL.a(ZIIIIZ)V")
	public void method273(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= field789;
		arg2 -= field790;
		if (arg3 == 0) {
			if (arg0 == 0) {
				method275(arg1, 128, arg2);
				method275(arg1 - 1, 8, arg2);
			}

			if (arg0 == 1) {
				method275(arg1, 2, arg2);
				method275(arg1, 32, arg2 + 1);
			}

			if (arg0 == 2) {
				method275(arg1, 8, arg2);
				method275(arg1 + 1, 128, arg2);
			}

			if (arg0 == 3) {
				method275(arg1, 32, arg2);
				method275(arg1, 2, arg2 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				method275(arg1, 1, arg2);
				method275(arg1 - 1, 16, arg2 + 1);
			}

			if (arg0 == 1) {
				method275(arg1, 4, arg2);
				method275(arg1 + 1, 64, arg2 + 1);
			}

			if (arg0 == 2) {
				method275(arg1, 16, arg2);
				method275(arg1 + 1, 1, arg2 - 1);
			}

			if (arg0 == 3) {
				method275(arg1, 64, arg2);
				method275(arg1 - 1, 4, arg2 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg0 == 0) {
				method275(arg1, 130, arg2);
				method275(arg1 - 1, 8, arg2);
				method275(arg1, 32, arg2 + 1);
			}

			if (arg0 == 1) {
				method275(arg1, 10, arg2);
				method275(arg1, 32, arg2 + 1);
				method275(arg1 + 1, 128, arg2);
			}

			if (arg0 == 2) {
				method275(arg1, 40, arg2);
				method275(arg1 + 1, 128, arg2);
				method275(arg1, 2, arg2 - 1);
			}

			if (arg0 == 3) {
				method275(arg1, 160, arg2);
				method275(arg1, 2, arg2 - 1);
				method275(arg1 - 1, 8, arg2);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					method275(arg1, 0x10000, arg2);
					method275(arg1 - 1, 4096, arg2);
				}

				if (arg0 == 1) {
					method275(arg1, 1024, arg2);
					method275(arg1, 16384, arg2 + 1);
				}

				if (arg0 == 2) {
					method275(arg1, 4096, arg2);
					method275(arg1 + 1, 0x10000, arg2);
				}

				if (arg0 == 3) {
					method275(arg1, 16384, arg2);
					method275(arg1, 1024, arg2 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					method275(arg1, 512, arg2);
					method275(arg1 - 1, 8192, arg2 + 1);
				}

				if (arg0 == 1) {
					method275(arg1, 2048, arg2);
					method275(arg1 + 1, 32768, arg2 + 1);
				}

				if (arg0 == 2) {
					method275(arg1, 8192, arg2);
					method275(arg1 + 1, 512, arg2 - 1);
				}

				if (arg0 == 3) {
					method275(arg1, 32768, arg2);
					method275(arg1 - 1, 2048, arg2 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg0 == 0) {
					method275(arg1, 66560, arg2);
					method275(arg1 - 1, 4096, arg2);
					method275(arg1, 16384, arg2 + 1);
				}

				if (arg0 == 1) {
					method275(arg1, 5120, arg2);
					method275(arg1, 16384, arg2 + 1);
					method275(arg1 + 1, 0x10000, arg2);
				}

				if (arg0 == 2) {
					method275(arg1, 20480, arg2);
					method275(arg1 + 1, 0x10000, arg2);
					method275(arg1, 1024, arg2 - 1);
				}

				if (arg0 == 3) {
					method275(arg1, 81920, arg2);
					method275(arg1, 1024, arg2 - 1);
					method275(arg1 - 1, 4096, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("MNHXSMWL.a(ZIIIIBI)V")
	public void method274(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg1 -= field789;
		arg2 -= field790;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg3;
			arg3 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field791) {
				for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field792) {
						method275(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("MNHXSMWL.a(IZII)V")
	public void method275(int arg0, int arg1, int arg2) {
		field793[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("MNHXSMWL.c(III)V")
	public void method276(int arg0, int arg1) {
		arg0 -= field789;
		arg1 -= field790;
		field793[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("MNHXSMWL.a(BIIIIII)Z")
	public boolean method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg1 == arg2) {
			return true;
		}

		arg4 -= field789;
		arg2 -= field790;
		arg0 -= field789;
		arg1 -= field790;
		if (arg5 == 0) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg4 && arg1 == arg2) {
					return true;
				}

				if (arg0 == arg4 && arg1 + 1 == arg2 && (field793[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg1 - 1 == arg2 && (field793[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 == arg4 && arg1 + 1 == arg2) {
					return true;
				}

				if (arg0 - 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 + 1 == arg4 && arg1 == arg2) {
					return true;
				}

				if (arg0 == arg4 && arg1 + 1 == arg2 && (field793[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg1 - 1 == arg2 && (field793[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 == arg4 && arg1 - 1 == arg2) {
					return true;
				}

				if (arg0 - 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg4 && arg1 == arg2) {
					return true;
				}

				if (arg0 == arg4 && arg1 + 1 == arg2) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg1 - 1 == arg2 && (field793[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg1 + 1 == arg2) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg1 == arg2) {
					return true;
				}

				if (arg0 == arg4 && arg1 - 1 == arg2 && (field793[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg1 + 1 == arg2 && (field793[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg1 == arg2) {
					return true;
				}

				if (arg0 == arg4 && arg1 - 1 == arg2) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 - 1 == arg4 && arg1 == arg2) {
					return true;
				}

				if (arg0 == arg4 && arg1 + 1 == arg2 && (field793[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg1 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg0 == arg4 && arg1 + 1 == arg2 && (field793[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg1 - 1 == arg2 && (field793[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg1 == arg2 && (field793[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("MNHXSMWL.a(IIIIIZI)Z")
	public boolean method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg4 == arg5) {
			return true;
		}

		arg1 -= field789;
		arg5 -= field790;
		arg2 -= field789;
		arg4 -= field790;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg2 + 1 == arg1 && arg4 == arg5 && (field793[arg1][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg4 - 1 == arg5 && (field793[arg1][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg2 - 1 == arg1 && arg4 == arg5 && (field793[arg1][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg4 - 1 == arg5 && (field793[arg1][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg2 - 1 == arg1 && arg4 == arg5 && (field793[arg1][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg4 + 1 == arg5 && (field793[arg1][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg2 + 1 == arg1 && arg4 == arg5 && (field793[arg1][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg4 + 1 == arg5 && (field793[arg1][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg1 == arg2 && arg4 + 1 == arg5 && (field793[arg1][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg4 - 1 == arg5 && (field793[arg1][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg1 && arg4 == arg5 && (field793[arg1][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg1 && arg4 == arg5 && (field793[arg1][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("MNHXSMWL.a(IIIIIIII)Z")
	public boolean method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg1 + arg6 - 1;
		if (arg2 >= arg4 && arg2 <= var8 && arg3 >= arg1 && arg3 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg2 && arg3 >= arg1 && arg3 <= var9 && (field793[arg2 - field789][arg3 - field790] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg3 >= arg1 && arg3 <= var9 && (field793[arg2 - field789][arg3 - field790] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg3 && arg2 >= arg4 && arg2 <= var8 && (field793[arg2 - field789][arg3 - field790] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg3 && arg2 >= arg4 && arg2 <= var8 && (field793[arg2 - field789][arg3 - field790] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
