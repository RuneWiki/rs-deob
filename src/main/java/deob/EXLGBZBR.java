package deob;

@ObfuscatedName("EXLGBZBR")
public class EXLGBZBR {

	@ObfuscatedName("EXLGBZBR.f")
	public int field611 = 0;

	@ObfuscatedName("EXLGBZBR.g")
	public int field612 = 0;

	@ObfuscatedName("EXLGBZBR.h")
	public int field613;

	@ObfuscatedName("EXLGBZBR.i")
	public int field614;

	@ObfuscatedName("EXLGBZBR.j")
	public int[][] field615;

	public EXLGBZBR(int arg0, int arg1) {
		field613 = arg1;
		field614 = arg0;
		field615 = new int[field613][field614];
		method240();
	}

	@ObfuscatedName("EXLGBZBR.a()V")
	public void method240() {
		for (int var1 = 0; var1 < field613; var1++) {
			for (int var2 = 0; var2 < field614; var2++) {
				if (var1 == 0 || var2 == 0 || field613 - 1 == var1 || field614 - 1 == var2) {
					field615[var1][var2] = 0xFFFFFF;
				} else {
					field615[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("EXLGBZBR.a(ZIIZII)V")
	public void method241(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field611;
		arg1 -= field612;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method244(arg3, arg1, 128);
				method244(arg3 - 1, arg1, 8);
			}

			if (arg2 == 1) {
				method244(arg3, arg1, 2);
				method244(arg3, arg1 + 1, 32);
			}

			if (arg2 == 2) {
				method244(arg3, arg1, 8);
				method244(arg3 + 1, arg1, 128);
			}

			if (arg2 == 3) {
				method244(arg3, arg1, 32);
				method244(arg3, arg1 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method244(arg3, arg1, 1);
				method244(arg3 - 1, arg1 + 1, 16);
			}

			if (arg2 == 1) {
				method244(arg3, arg1, 4);
				method244(arg3 + 1, arg1 + 1, 64);
			}

			if (arg2 == 2) {
				method244(arg3, arg1, 16);
				method244(arg3 + 1, arg1 - 1, 1);
			}

			if (arg2 == 3) {
				method244(arg3, arg1, 64);
				method244(arg3 - 1, arg1 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method244(arg3, arg1, 130);
				method244(arg3 - 1, arg1, 8);
				method244(arg3, arg1 + 1, 32);
			}

			if (arg2 == 1) {
				method244(arg3, arg1, 10);
				method244(arg3, arg1 + 1, 32);
				method244(arg3 + 1, arg1, 128);
			}

			if (arg2 == 2) {
				method244(arg3, arg1, 40);
				method244(arg3 + 1, arg1, 128);
				method244(arg3, arg1 - 1, 2);
			}

			if (arg2 == 3) {
				method244(arg3, arg1, 160);
				method244(arg3, arg1 - 1, 2);
				method244(arg3 - 1, arg1, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method244(arg3, arg1, 0x10000);
					method244(arg3 - 1, arg1, 4096);
				}

				if (arg2 == 1) {
					method244(arg3, arg1, 1024);
					method244(arg3, arg1 + 1, 16384);
				}

				if (arg2 == 2) {
					method244(arg3, arg1, 4096);
					method244(arg3 + 1, arg1, 0x10000);
				}

				if (arg2 == 3) {
					method244(arg3, arg1, 16384);
					method244(arg3, arg1 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method244(arg3, arg1, 512);
					method244(arg3 - 1, arg1 + 1, 8192);
				}

				if (arg2 == 1) {
					method244(arg3, arg1, 2048);
					method244(arg3 + 1, arg1 + 1, 32768);
				}

				if (arg2 == 2) {
					method244(arg3, arg1, 8192);
					method244(arg3 + 1, arg1 - 1, 512);
				}

				if (arg2 == 3) {
					method244(arg3, arg1, 32768);
					method244(arg3 - 1, arg1 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method244(arg3, arg1, 66560);
					method244(arg3 - 1, arg1, 4096);
					method244(arg3, arg1 + 1, 16384);
				}

				if (arg2 == 1) {
					method244(arg3, arg1, 5120);
					method244(arg3, arg1 + 1, 16384);
					method244(arg3 + 1, arg1, 0x10000);
				}

				if (arg2 == 2) {
					method244(arg3, arg1, 20480);
					method244(arg3 + 1, arg1, 0x10000);
					method244(arg3, arg1 - 1, 1024);
				}

				if (arg2 == 3) {
					method244(arg3, arg1, 81920);
					method244(arg3, arg1 - 1, 1024);
					method244(arg3 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EXLGBZBR.a(IIIIIBZ)V")
	public void method242(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg3 -= field611;
		arg1 -= field612;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg4;
			arg4 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg3; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field613) {
				for (int var10 = arg1; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field614) {
						method244(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("EXLGBZBR.a(IIB)V")
	public void method243(int arg0, int arg1) {
		arg0 -= field611;
		arg1 -= field612;
		field615[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("EXLGBZBR.a(III)V")
	public void method244(int arg0, int arg1, int arg2) {
		field615[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("EXLGBZBR.a(IIZIII)V")
	public void method245(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg2 -= field611;
		arg0 -= field612;
		if (arg3 == 0) {
			if (arg4 == 0) {
				method247(arg0, 128, arg2);
				method247(arg0, 8, arg2 - 1);
			}

			if (arg4 == 1) {
				method247(arg0, 2, arg2);
				method247(arg0 + 1, 32, arg2);
			}

			if (arg4 == 2) {
				method247(arg0, 8, arg2);
				method247(arg0, 128, arg2 + 1);
			}

			if (arg4 == 3) {
				method247(arg0, 32, arg2);
				method247(arg0 - 1, 2, arg2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				method247(arg0, 1, arg2);
				method247(arg0 + 1, 16, arg2 - 1);
			}

			if (arg4 == 1) {
				method247(arg0, 4, arg2);
				method247(arg0 + 1, 64, arg2 + 1);
			}

			if (arg4 == 2) {
				method247(arg0, 16, arg2);
				method247(arg0 - 1, 1, arg2 + 1);
			}

			if (arg4 == 3) {
				method247(arg0, 64, arg2);
				method247(arg0 - 1, 4, arg2 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg4 == 0) {
				method247(arg0, 130, arg2);
				method247(arg0, 8, arg2 - 1);
				method247(arg0 + 1, 32, arg2);
			}

			if (arg4 == 1) {
				method247(arg0, 10, arg2);
				method247(arg0 + 1, 32, arg2);
				method247(arg0, 128, arg2 + 1);
			}

			if (arg4 == 2) {
				method247(arg0, 40, arg2);
				method247(arg0, 128, arg2 + 1);
				method247(arg0 - 1, 2, arg2);
			}

			if (arg4 == 3) {
				method247(arg0, 160, arg2);
				method247(arg0 - 1, 2, arg2);
				method247(arg0, 8, arg2 - 1);
			}
		}

		if (arg1) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					method247(arg0, 0x10000, arg2);
					method247(arg0, 4096, arg2 - 1);
				}

				if (arg4 == 1) {
					method247(arg0, 1024, arg2);
					method247(arg0 + 1, 16384, arg2);
				}

				if (arg4 == 2) {
					method247(arg0, 4096, arg2);
					method247(arg0, 0x10000, arg2 + 1);
				}

				if (arg4 == 3) {
					method247(arg0, 16384, arg2);
					method247(arg0 - 1, 1024, arg2);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					method247(arg0, 512, arg2);
					method247(arg0 + 1, 8192, arg2 - 1);
				}

				if (arg4 == 1) {
					method247(arg0, 2048, arg2);
					method247(arg0 + 1, 32768, arg2 + 1);
				}

				if (arg4 == 2) {
					method247(arg0, 8192, arg2);
					method247(arg0 - 1, 512, arg2 + 1);
				}

				if (arg4 == 3) {
					method247(arg0, 32768, arg2);
					method247(arg0 - 1, 2048, arg2 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg4 == 0) {
					method247(arg0, 66560, arg2);
					method247(arg0, 4096, arg2 - 1);
					method247(arg0 + 1, 16384, arg2);
				}

				if (arg4 == 1) {
					method247(arg0, 5120, arg2);
					method247(arg0 + 1, 16384, arg2);
					method247(arg0, 0x10000, arg2 + 1);
				}

				if (arg4 == 2) {
					method247(arg0, 20480, arg2);
					method247(arg0, 0x10000, arg2 + 1);
					method247(arg0 - 1, 1024, arg2);
				}

				if (arg4 == 3) {
					method247(arg0, 81920, arg2);
					method247(arg0 - 1, 1024, arg2);
					method247(arg0, 4096, arg2 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EXLGBZBR.a(ZIIIIII)V")
	public void method246(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg3 -= field611;
		arg5 -= field612;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg1;
			arg1 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg3; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field613) {
				for (int var10 = arg5; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field614) {
						method247(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("EXLGBZBR.a(IIBI)V")
	public void method247(int arg0, int arg1, int arg2) {
		field615[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("EXLGBZBR.a(IBI)V")
	public void method248(int arg0, int arg1) {
		arg1 -= field611;
		arg0 -= field612;
		field615[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("EXLGBZBR.a(IIIIIII)Z")
	public boolean method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg1) {
			return true;
		}

		arg4 -= field611;
		arg0 -= field612;
		arg3 -= field611;
		arg1 -= field612;
		if (arg2 == 0) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field615[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field615[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 == arg4 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg3 - 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field615[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field615[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 == arg4 && arg1 - 1 == arg0) {
					return true;
				}

				if (arg3 - 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field615[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field615[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field615[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field615[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg3 == arg4 && arg1 + 1 == arg0 && (field615[arg4][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg1 - 1 == arg0 && (field615[arg4][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg4 && arg0 == arg1 && (field615[arg4][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EXLGBZBR.b(IIIIIII)Z")
	public boolean method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg3) {
			return true;
		}

		arg5 -= field611;
		arg3 -= field612;
		arg4 -= field611;
		arg0 -= field612;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}

			if (arg1 == 0) {
				if (arg4 + 1 == arg5 && arg0 == arg3 && (field615[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field615[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 - 1 == arg5 && arg0 == arg3 && (field615[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field615[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 - 1 == arg5 && arg0 == arg3 && (field615[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field615[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 + 1 == arg5 && arg0 == arg3 && (field615[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field615[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg4 == arg5 && arg0 + 1 == arg3 && (field615[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg0 - 1 == arg3 && (field615[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg5 && arg0 == arg3 && (field615[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg5 && arg0 == arg3 && (field615[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EXLGBZBR.a(IIIIIIII)Z")
	public boolean method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg4 - 1;
		int var9 = arg0 + arg6 - 1;
		if (arg3 >= arg1 && arg3 <= var8 && arg5 >= arg6 && arg5 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg3 && arg5 >= arg6 && arg5 <= var9 && (field615[arg3 - field611][arg5 - field612] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg5 >= arg6 && arg5 <= var9 && (field615[arg3 - field611][arg5 - field612] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg3 >= arg1 && arg3 <= var8 && (field615[arg3 - field611][arg5 - field612] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg5 && arg3 >= arg1 && arg3 <= var8 && (field615[arg3 - field611][arg5 - field612] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
